import java.util.Scanner;

public class linkedListClass {
    Node head;

    public class Node{
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    public void addlast(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return;
        }

        Node ptr = head;

        while(ptr.next != null) {
           ptr = ptr.next;
        }

        ptr.next = newNode;
    }
    public  void printlist() {
        Node ptr = head;

        while(ptr != null) {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        linkedListClass list = new linkedListClass();

        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.addlast(6);
        list.addlast(7);
        list.addlast(8);
        list.addlast(9);

        System.out.println("--LinkedList--");
        list.printlist();

     //   System.out.println();

     //   list.revrse();
     //   System.out.println("--Reverse LinkedList--");
     //   list.printlist();

      //  System.out.println();

       // list.getsize();


        // int pos = sc.nextInt();
        // int k = sc.nextInt();
        // list.addElementGivenPostion(pos, k);
       //  System.out.println("--Add Element at Given Position in LinkedList--");
        // list.printlist();

         System.out.println();

         list.getsize();

        System.out.println();

        System.out.println("--Mid Element of the Linked List--");
        list.MidElement();

        System.out.println();

        System.out.println("--Delete First Node from the listt--");
        list.deleteFirstNode();
        list.printlist();

        System.out.println();

        System.out.println("--Delete Last Node from the list--");
        list.deleteLastNode();
        list.printlist();

        System.out.println();
//
        int pos = sc.nextInt();
//        System.out.println("--Delete Node at given Position");
//        list.deleteNodeAtGivenPos( pos);
//        list.printlist();

        System.out.println("--Delete Node From last at given position");
        list.deleteNodeAtLastgivenPos(pos);
        list.printlist();
    }
    public void revrse() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }
    public void addElementGivenPostion(int pos, int k) {
        Node ptr = head;
        Node newNode = new Node(k);

        if(pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
      for(int i = 1; i < pos-1; i++) {
          ptr = ptr.next;
      }

        newNode.next = ptr.next;
        ptr.next = newNode;
    }
    public int getsize() {
        Node ptr = head;
         int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
       // System.out.println("Size of LinkedList : " + count);
        return count;
    }
    public void MidElement() {
        Node ptr = head;
        int size = getsize();
        if(size == 1) {
            System.out.println(head.data);
        }
        else{
            int mid = size/2;

            for(int i = 0; i < mid; i++) {
                ptr = ptr.next;
            }
            System.out.println(ptr.data);
        }
    }
    public void deleteFirstNode() {
        Node ptr = head;
        if(ptr == null || ptr.next == null) {
            ptr = null;
        }
        else{
            ptr = ptr.next;
        }
        head = ptr;
    }
    public void deleteLastNode() {
        Node ptr = head;
        if(ptr == null || ptr.next == null) {
            head = null;
        }
        else {
            while(ptr != null){
                if(ptr.next.next == null){
                    ptr.next = null;

                }
                ptr = ptr.next;
            }
        }
    }
    public void deleteNodeAtGivenPos(int pos){
        Node ptr = head;
        if(ptr == null || pos > getsize()){
            System.out.println("Invalid choice");
            return;
        }
        if(pos == 0){
            head = ptr.next;
            return;
        }
            for(int i = 0; i < pos-1; i++) {
                ptr = ptr.next;
            }
            if(ptr.next == null) return;
        ptr.next = ptr.next.next;
    }
    public void deleteNodeAtLastgivenPos(int pos){
        Node ptr = head;
        if(ptr == null || pos > getsize()){
            System.out.println("Invalid choice");
            return;
        }
        if(pos == getsize()){
            head = ptr.next;
            return;
        }
        int size = getsize();
        for(int i = 0; i < size - pos -1; i++){
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
    }
}
