// DELETE A NODE IN BINARY SEARCH TREEEE
/*
 *  CASE1: NO CHILD(LEAF NODE) -> DELETE THE NODE AND RETURN NULL TO THE PARENT
 * CASE 2: ONE CHILD -> DELETE THE NODE AND REPLACE WITH CHILD NODE
 *  CASE 3: TWO CHILDREN -> REPLACE THE VALUE WITH INDORDER SUCCESSOR 
 *  -> DELETE THE NODE FOR INORDER SUCCESSOR
 */

public class Deletebst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        // search the node to be deleted
        // search logic will be used -> search in a bst
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else { // root.data==key
            // case 1: leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case2 : only 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case3 : two children
            // Find the inorder successor and make another function for the same
            Node io = inorderSuccessor(root.right);
            root.data = io.data;
            root.right = delete(root.right, io.data);
        }
        return root;
    }

    public static void main(String[] args) {

    }

}
