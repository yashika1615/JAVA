// PRINT IN RANGE IN BST
// X=6, Y=10

public class Printinrange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
            return root;
        } else {
            root.right = insert(root.right, val);
            return root;
        }

    }

    public static void main(String[] args) {
        Node root = null;

    }

}
