import java.util.Scanner;
import java.util.Stack;

public class TraversalPrePostInorder {

    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right) {
            this.data = data;
            this.left =left;
            this.right = right;
        }
    }
    public static class Pair {
        int state;
        Node node;
        Pair(Node node, int state) {
            this.state = state;
            this.node = node;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }

        Node root = new Node(a[0], null, null);
        Pair rtp = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if(top.state == 1) {
                idx++;
                if(a[idx] != -1) {
                    top.node.left = new Node(a[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }
                else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                idx++;
                if(a[idx] != -1) {
                    top.node.right = new Node(a[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }
                else {
                    top.node.right = null;
                }
                top.state++;
            } else  {
                st.pop();
            }
        }
        System.out.println();
        System.out.println("Tree is : ");
        Display(root);

        System.out.println();

        System.out.print("Preorder traversal : ");
        preOrder(root);
        System.out.println();

        System.out.print("Inorder traversal : ");
        inOrder(root);
        System.out.println();

        System.out.print("Postorder traversal : ");
        postOrder(root);
    }
    public static void Display(Node root) {
        if(root == null) {
            return;
        }
        String str = "";
        str += root.left == null ? "Null" : root.left.data + " ";
        str += " <- " + root.data + " -> ";
        str += root.right == null ? "Null" : root.right.data + " ";
        System.out.println(str);
        Display(root.left);
        Display(root.right);
    }
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
