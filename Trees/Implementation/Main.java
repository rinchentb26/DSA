import java.util.LinkedList;

class Node {
    char data;
    Node left;
    Node right;

    Node(char data) {
        this.data = data;
        left = right = null;
    }
}

class Main {
    public static void main(String args[]) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        // root.left.left = new Node('D');
        // root.left.right = new Node('E');
        System.out.print("PREORDER TRAVERSAL: ");
        preorder(root);
        System.out.print("\nINORDER TRAVERSAL: ");
        inorder(root);
        System.out.print("\nPOSTORDER TRAVERSAL: ");
        postorder(root);
        System.out.print("\nLEVEL ORDER TRAVERSAL: ");
        levelOrder(root);
        System.out.print("\nCOUNT OF NODES: " + countNodes(root));
    }

    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + "\t");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + "\t");
            inorder(root.right);
        }

    }

    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "\t");
        }

    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        LinkedList<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node popped = q.remove();
            System.out.print(popped.data + "\t");
            if (popped.left != null)
                q.add(popped.left);
            if (popped.right != null)
                q.add(popped.right);
        }
    }

    static int countNodes(Node root) {
        if (root != null) {
            int x, y;
            x = countNodes(root.left);
            y = countNodes(root.right);
            return x + y + 1;
        }
        return 0;
    }
}