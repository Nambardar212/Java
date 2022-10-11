import java.util.Scanner;

public class RotateLinkedListKtimes {
    Node head;
     public class Node{
         int data;
         Node next;
         Node(int d) {
             this.data = d;
             this.next = null;
         }
     }
     public void addL(int val){
         Node newNode = new Node(val);
         System.out.println("add element into list is : " + val);
         if(head == null){
             head = newNode;
             return;
         }

         Node ptr = head;
         while(ptr.next != null) {
             ptr = ptr.next;
         }
         ptr.next = newNode;
     }
     public void display() {
         if(head == null){
             System.out.println("List is Empty");
             return;
         }
         Node ptr = head;
         while(ptr != null){
             System.out.print(ptr.data + " --> ");
             ptr = ptr.next;
         }
         System.out.print("null");
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RotateLinkedListKtimes li = new RotateLinkedListKtimes();
        for(int i = 0; i < n; i++) {
            li.addL(sc.nextInt());
        }
        int k = sc.nextInt();
        li.display();
        System.out.println();
        System.out.println("Rotate linkedlist is : ");
        li.Rotate(k);
        System.out.println();
        li.display();
    }
    public void Rotate(int k) {
        if(k == 0)
            return;
         Node curr = head;
         int count = 1;
        while(count < k && curr != null){
            curr = curr.next;
            count++;
        }

        Node kthNode = curr;
        while (curr.next != null){
            curr = curr.next;
        }

        curr.next = head;
        head = kthNode.next;
        kthNode.next = null;
    }
}
