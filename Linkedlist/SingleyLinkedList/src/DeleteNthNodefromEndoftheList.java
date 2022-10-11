import java.util.Scanner;

public class DeleteNthNodefromEndoftheList {
    Node head;

    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public void addL(int val){
        Node newNode = new Node(val);
        System.out.println("Add element into list is : " + val);
        if(head == null) {
            head = newNode;
            return;
        }
         Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }
    public void Display(){
        Node ptr = head;
        System.out.println("List is : ");
        if(head == null){
            System.out.print("null");
            return;
        }
        while(ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }

        System.out.print("null");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DeleteNthNodefromEndoftheList list = new DeleteNthNodefromEndoftheList();
        for(int i = 0; i < n; i++) {
            list.addL(sc.nextInt());
        }

        list.Display();

        int k = sc.nextInt();
        list.DeleteNthNodeFromEnd(k);
        list.Display();
    }
    public void DeleteNthNodeFromEnd(int n){
        int size = getSize();
        Node ptr = head;

        if(size == n) {
            ptr = ptr.next;
            head = ptr;
            return;
        }
        for(int i = 1; i < size - n; i++) {
               ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
    }
    public int getSize(){
        Node ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }
}
