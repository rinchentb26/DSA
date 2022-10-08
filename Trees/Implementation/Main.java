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
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        System.out.print("PREORDER TRAVERSAL: ");
        preorder(root);
        System.out.print("\nINORDER TRAVERSAL: ");
        inorder(root);
        System.out.print("\nPOSTORDER TRAVERSAL: ");
        postorder(root);
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
}