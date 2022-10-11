import java.util.Scanner;

public class ScratchImplementationOfSTACKusingLinkedList {
    Node top;
    int size;
    public class Node{
        int data;
        Node next;
    }
    ScratchImplementationOfSTACKusingLinkedList(){
        this.top = null;
        this.size = 0;

    }
    public void push(int d){
        Node newNode = new Node();

        if(newNode == null){
            System.out.println("Stack is Overflow");
            return;
        }

        newNode.data = d;
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Add element in stack is : " + d);
    }
    public void printList(){
        if(top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node ptr = top;
        System.out.println("Stack is : ");
        while(ptr != null) {
            System.out.print(" --> " + ptr.data);
            ptr = ptr.next;
        }

    }
    public void peek(){
        if(top == null){
            System.out.print("Stack is empty");
            return;
        }
        System.out.print("Peek element is : " + top.data);
    }
    public void pop() {
        if(top == null) {
            System.out.print("Stack is UnderFlow");
            return;
        }
        System.out.print("pop element is : " + top.data);
        size--;
        top = top.next;
    }
    public void getSize(){
        System.out.print("Size of stack is : " + size);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScratchImplementationOfSTACKusingLinkedList st = new ScratchImplementationOfSTACKusingLinkedList();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        st.printList();
        System.out.println();
        st.peek();
        System.out.println();
        st.getSize();
        System.out.println();
        st.pop();
        System.out.println();
        st.printList();
        System.out.println();
        st.peek();
        System.out.println();
        st.getSize();
        System.out.println();
        st.pop();
        System.out.println();
        st.printList();
        System.out.println();
        st.peek();
        System.out.println();
        st.getSize();
    }
}
