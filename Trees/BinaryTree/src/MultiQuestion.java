import java.util.Scanner;
import java.util.Stack;

public class MultiQuestion {

    public static class Node {
         int data;
         Node left;
         Node right;
         Node (int data, Node left, Node right) {
             this.data = data;
             this.left = left;
             this.right = right;
         }
    }

    public static class Pair {
        int state;
        Node node;
        Pair (Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }
   public static void createTree(int []arr , Node root) {
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
           } else if (top.state == 2) {
               idx++;
               if(arr[idx] != -1) {
                   top.node.right = new Node(arr[idx], null, null);
                   Pair rp = new Pair(top.node.right, 1);
                   st.push(rp);
               } else {
                   top.node.right = null;
               }
               top.state++;
           } else {
               st.pop();
           }
       }
   }
    public static void display(Node root) {
        if(root == null) {
            return;
        }
        String str = "";
        str += root.left == null ? "Null" : root.left.data + " ";
        str += " <- " + root.data + " -> ";
        str += root.right == null ? "Null" : root.right.data + " ";
        System.out.println(str);

        display(root.left);
        display(root.right);
    }
    public static void Display(Node root) {
        if(root == null) {
            return;
        }

        Display(root.left);
        System.out.print(root.data + " ");
        Display(root.right);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr1 = new int[n];
        for(int i =0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        Node root1 = new Node(arr1[0], null, null);
        createTree(arr1, root1);

        int n2 = sc.nextInt();
        int []arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Node root2 = new Node(arr2[0], null, null);
        createTree(arr2, root2);

//        System.out.println("Tree one is : ");
//        display(root1);
//        System.out.println();

//        System.out.println("Tree two is : ");
//        display(root2);
//        System.out.println();
//
//        //Determine if two trees are Identical
//        if(isIdentical(root1, root2)) {
//            System.out.println("Identical or Not : " + true);
//        } else {
//            System.out.println("Identical or Not : " + false);
//        }

//        //Determine if two trees are mirror Image
//        if(isMirror(root1, root2)){
//            System.out.println("Mirror Image or Not : " + true);
//        } else {
//            System.out.println("Mirror Image or Not : " + false);
//        }

        //Convert it into its Mirror image
          Node mnode =  convertMirror(root1);
          Display(mnode);
    }
    //Determine if two trees are Identical
    public static boolean isIdentical(Node root1, Node root2) {
        if(root1 == null && root2 == null) {
            return true;
        }

        if(root1 != null && root2 != null)
        return (root1.data == root2.data && isIdentical(root1.left, root2.left)
                    && isIdentical(root1.right, root2.right));

        return false;
    }

    //Determine if two trees are mirror Image
    public static boolean isMirror(Node a, Node b) {
        if(a == null && b == null) {
            return true;
        }

        if(a != null && b != null) {
            return (a.data == b.data && isMirror(a.left, b.right) && isMirror(a.right, b.left));
        }

        return false;
    }

    //Convert it into its Mirror image
    public static Node convertMirror(Node a) {
        if(a == null) {
            return a;
        }

        Node left = convertMirror(a.left);
        Node right = convertMirror(a.right);

        a.left = right;
        a.right = left;

        return a;
    }
}
