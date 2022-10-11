package Recusion;


import java.util.Scanner;

public class RevesreLinkedList {
    Node head;

    public class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public void addaElement(int d){
        Node newNode = new Node(d);
        System.out.println("Add element into list : " + d);
        if(head == null){
            head = newNode;
            return;
        }
        Node ptr = head;
        while (ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }
    public  void printlist() {
        Node ptr = head;
        System.out.print("List is : ");
        while(ptr != null) {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RevesreLinkedList list = new RevesreLinkedList();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.addaElement(sc.nextInt());
        }
        list.printlist();

        System.out.println();
        list.reverseList();

        list.printlist();
    }
    public void reverseList(){
         head =   reverse(head);
    }
    public Node reverse(Node node){
        Node ptr;
        if(node.next == null) {
            return node;
        }
        ptr = reverse(node.next);

        node.next.next = node;
        node.next = null;
        return ptr;
    }
}
