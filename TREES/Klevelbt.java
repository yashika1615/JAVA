// Kth LEVEL OF A BINARY TREE
public class Klevelbt {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void kthLevelofabt(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevelofabt(root.left, level + 1, k);
        kthLevelofabt(root.right, level + 1, k);

    }

    static int idx;

    public static Node buildtree(int nodes[]) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildtree(nodes);
        newNode.right = buildtree(nodes);
        return newNode;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1 };
        Node root = buildtree(nodes);
        int k = 2;
        kthLevelofabt(root, 1, 2);

    }
}
