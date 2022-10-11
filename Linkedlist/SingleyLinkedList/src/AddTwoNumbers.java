import java.util.Scanner;

public class AddTwoNumbers {
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    public void AddL(int val) {
        Node newNode = new Node(val);
        System.out.println("Add element into list : " + val);
        if(head == null) {
            head = newNode;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }
    public void Display() {
        Node ptr = head;
        if(head == null) {
            System.out.println("null");
            return;
        }
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        AddTwoNumbers list1 = new AddTwoNumbers();
        for(int i = 0; i < n1; i++) {
            list1.AddL(sc.nextInt());
        }
        int n2 = sc.nextInt();
        AddTwoNumbers list2 = new AddTwoNumbers();
        for(int i = 0; i < n2; i++){
            list2.AddL(sc.nextInt());
        }
        System.out.println("List 1 is : ");
        list1.Display();
        System.out.println();
        System.out.println("List 2 is : ");
        list2.Display();
        System.out.println();
        System.out.println("sum is : ");
        Node sum = AddTwoNo(list1.head, list2.head);
        display(sum);
    }
    public  static  void display(Node head1) {
        Node ptr = head1;
        if(head1 == null) {
            System.out.print(0);
            return;
        }
        while (ptr != null) {
            System.out.print(ptr.data);
            ptr = ptr.next;
        }
    }
    public static Node AddTwoNo(Node l1 , Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while( l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            Node node = new Node(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}
