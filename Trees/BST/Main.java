class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {
    public static void main(String args[]) {
        Node root = null;
        root = recursive_insert(root, 50);
        root = recursive_insert(root, 40);
        root = recursive_insert(root, 30);
        root = recursive_insert(root, 60);
        root = recursive_insert(root, 80);
        preorder(root);
        System.out.println(search_iterative(root, 80) ? "Present" : "Not Present");
    }

    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + "\t");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // iterative version of insertion in BST
    public static Node insert_iterative(Node root, int val) {
        Node newnode = new Node(val);
        if (root == null) {
            root = newnode;
        } else {
            Node temp = root;
            Node parent = null;
            while (temp != null) {
                parent = temp;
                if (temp.data < val)
                    temp = temp.right;
                else
                    temp = temp.left;
            }
            if (parent.data < val)
                parent.right = newnode;
            else
                parent.left = newnode;
        }
        return root;
    }

    // recursive fn to insert in bst
    public static Node recursive_insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        else if (root.data < val)
            root.right = recursive_insert(root.right, val);
        else if (root.data > val)
            root.left = recursive_insert(root.left, val);
        return root;
    }

    public static Node search(Node root, int val) {
        if (root == null || root.data == val)
            return root;
        else if (root.data > val)
            return search(root.left, val);
        return search(root.right, val);
    }

    public static boolean search_iterative(Node root, int val) {
        while (root != null) {
            if (root.data == val)
                return true;
            else if (root.data > val)
                root = root.left;
            else
                root = root.right;
        }
        return false;
    }
}