// SEARCH A BST
public class Searchbst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean searchBst(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) {
            return searchBst(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return searchBst(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if (searchBst(root, 0)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
