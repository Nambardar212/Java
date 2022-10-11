import java.util.Scanner;
import java.util.Stack;

public class PalidromeOfLinkedList {
    Node head;
    public class Node {
        char data;
        Node next;
        Node(char d) {
            this.data = d;
            this.next = null;
        }
    }
    public void addlast(char d) {
         Node newNode = new Node(d);
         if(head == null) {
             head = newNode;
             return;
         }
         Node ptr = head;
         while(ptr.next != null)
             ptr = ptr.next;

         ptr.next = newNode;
    }
    public void printList() {
        Node ptr = head;
        while(ptr != null) {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalidromeOfLinkedList list = new PalidromeOfLinkedList();

        int n = sc.nextInt();
        for(int  i = 0; i < n; i++) {
            list.addlast(sc.next().charAt(0));
        }

        list.printList();
        System.out.println();
//        System.out.println("--Check Palidrome of linked list--");
//        list.isPalidrome();
        System.out.println("--Check Palidrome of linked list using stack--");
        if(list.isPalidromeusingStack() == true){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
    public int getSize() {
        Node ptr = head;
        int count = 0;
        while(ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }
    public void isPalidrome() {
        Node ptr = head;
        boolean flag = true;
        int size = getSize();
        int mid = size/2;
        for(int  i = 0; i < mid; i++){
            ptr = ptr.next;
        }
        Node temp;
        if(size % 2 != 0) {
             temp = revrse(ptr.next);
        }
        else{
            temp = revrse(ptr);
        }


        for(int i = 0; i < mid; i++){

            if(head.data  == temp.data) {
                head = head.next;
                temp = temp.next;
            }
            else{
                flag = false;
                break;
            }

        }
        if(flag == true)
            System.out.println(true);
        else
            System.out.println(false);
    }
    public Node revrse(Node ptr) {
        Node curr = ptr;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ptr = prev;
         return ptr;
    }
    public boolean isPalidromeusingStack() {
        Node ptr = head;
        Stack<Character> st = new Stack<>();
        while(ptr != null) {
            st.push(ptr.data);
            ptr = ptr.next;
        }

        while (head != null) {
            char i = st.pop();
            if(head.data != i) {
                return false;
            }
            else{
                head = head.next;
            }
        }
        return true;
    }
}
