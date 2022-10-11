import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoSortedList {

    Node head;
    public  class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        MergeTwoSortedList list1 = new MergeTwoSortedList();
       // LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list1.addLast(sc.nextInt());
        }
        int m = sc.nextInt();
        MergeTwoSortedList list2 = new MergeTwoSortedList();

        for (int i = 0; i < m; i++) {
            list2.addLast(sc.nextInt());
        }

      Node temp =   list1.mergeSortList(list1.head, list2.head);
        PrintList(temp);
    }
    public void addLast(int d) {

        Node newnode = new Node(d);

        if(head == null) {
            head = newnode;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newnode;
    }
    public static void PrintList(Node head) {
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + " --> ");
            ptr =  ptr.next;
        }
        System.out.print("null");
    }
    public  Node mergeSortList(Node headA, Node headB){
        Node dummyNode = new Node(0);

        Node tail = dummyNode;
        while(true)
        {

            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }

            if(headA.data <= headB.data)
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }

            tail = tail.next;
        }
        return dummyNode.next;
    }
}
