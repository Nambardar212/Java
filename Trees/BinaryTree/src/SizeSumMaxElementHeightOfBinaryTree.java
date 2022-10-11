import java.util.Scanner;
import java.util.Stack;

public class SizeSumMaxElementHeightOfBinaryTree {

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
        int state;
        Node node;
        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        Integer []arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,null};

        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if(top.state == 1) {
                idx++;
                if(arr[idx] != -1) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            }
            else if(top.state == 2) {
                idx++;
                if(arr[idx] != -1) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            }
            else {
                st.pop();
            }
        }

        System.out.println("Display Tree : ");
        Display(root);

        System.out.println();

        int size = Size(root);
        System.out.println("Size of tree : " + size);

        System.out.println();

        int sum = Sum(root);
        System.out.println("Sum of tree : " + sum);

        System.out.println();

        int max = maxEle(root);
        System.out.println("Max element in tree : " + max);

        System.out.println();

        int height = heightTree(root);
        System.out.println("Height of tree : " + height);
    }
    // For display tree
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
    // for size of tree
    public static int Size(Node root) {
        if(root == null) {
            return 0;
        }
        int ls = Size(root.left);
        int rs = Size(root.right);
        return ls + rs + 1;
    }
    // for sum of tree
    public static int Sum(Node root) {
        if(root == null) {
            return 0;
        }
        int lsum = Sum(root.left);
        int rsum = Sum(root.right);
        return lsum + rsum + root.data;
    }
    // for Max Element in tree
    public static int maxEle(Node root) {
        if(root == null) {
            return -1;
        }
        int lmax = maxEle(root.left);
        int rmax = maxEle(root.right);

        return Math.max(root.data, Math.max(lmax, rmax));
    }
    public static int heightTree(Node root) {
        if(root == null) {
        //    return -1;
//            return 1;
            return 0;
        }
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);
        return Math.max(lh, rh) + 1;
    }
}

// 50 25 12 -1 -1 37 30 -1 -1 -1 75 62 -1 70 -1 -1 87 -1 -1