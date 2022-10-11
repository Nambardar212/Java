import java.util.Scanner;
import java.util.Stack;

public class CreateBinaryTreeAndDisplay {

    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;
        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }
 // display Binary tree
    public static void display(Node node) {
        if(node == null) {
            return;
        }
        String str = "";
        str += node.left == null ? "null" : node.left.data + " ";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "null" : node.right.data + " ";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
  //      Integer []a = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,null};

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
                    Node ln = new Node(a[idx], null, null);
                    top.node.left = ln;

                    Pair lp = new Pair(ln, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if(top.state == 2) {
                idx++;
                if(a[idx] != -1) {
                    Node rn = new Node(a[idx], null, null);
                    top.node.right = rn;

                    Pair rp = new Pair(rn, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }
        display(root);
    }
}
