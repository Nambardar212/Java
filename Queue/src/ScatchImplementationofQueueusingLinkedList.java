import java.util.Scanner;

public class ScatchImplementationofQueueusingLinkedList {
    Node rear, front;

    public class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    ScatchImplementationofQueueusingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        System.out.println("Add element in queue is : " + val);
        if(rear == null) {
            rear = newNode;
            front = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public void printList(){
        if(rear == front){
            System.out.println("Queue is empty");
            return;
        }
        Node ptr = front;
        System.out.println("Queue is : ");
        while(ptr != null) {
            System.out.print(ptr.data + " <-- ");
            ptr = ptr.next;
        }
    }
    public void dequeue() {
        if(rear == front){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Dequeue element is : " + front.data);
        front = front.next;
    }
    public void getSize(){
        int  count = 0;
        if(rear == front){
            System.out.println("Size is zero");
            return;
        }
        Node ptr = front;
        while(ptr != null){
            count++;
            ptr = ptr.next;
        }
        System.out.println("Size of queue is : " + count);
    }
    public void frontQueue(){
        if(rear == front) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front element is : " + front.data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ScatchImplementationofQueueusingLinkedList qu = new ScatchImplementationofQueueusingLinkedList();
        for(int i = 0; i < n; i++) {
            qu.enqueue(sc.nextInt());
        }
        qu.printList();
        System.out.println();
        qu.getSize();
        System.out.println();
        qu.frontQueue();
        System.out.println();
        qu.dequeue();
        System.out.println();
        qu.printList();
        System.out.println();
        qu.getSize();
        System.out.println();
        qu.frontQueue();
    }
}
