import java.util.Scanner;

public class CheckIdentical {
    Node head;
    Node tail;
    public class Node {
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public void addL (int d){
        Node newNode = new Node(d);
        System.out.println("Add element into list : " + d);
        if(head == null) {
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
    }
    public void display(){
        Node ptr = head;
        if(head == null){
            System.out.println("list is empty");
        }
        else {
            do {
                System.out.print(ptr.data + " -> ");
                ptr = ptr.next;
            }
            while (ptr != head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckIdentical list1 = new CheckIdentical();
        for(int i = 0; i < n; i++) {
            list1.addL(sc.nextInt());
        }

        int m = sc.nextInt();
        CheckIdentical list2 = new CheckIdentical();
        for(int i = 0; i < m; i++) {
            list2.addL(sc.nextInt());
        }

        System.out.print("List1 : ");
        list1.display();
        System.out.println();
        System.out.print("List2 : ");
        list2.display();

        System.out.println();
        System.out.println("List is Identical Or Not");
        if(check(list1.head, list2.head)){
            System.out.println("Identical");
        }
        else{
            System.out.println("Not Identical");
        }
    }
    public static boolean check(Node head1, Node head2){
        int l1 = height(head1);
        int l2 = height(head2);

        if(l1 != l2) {
            return false;
        }
         int count = 0;
        boolean flag = false;

        Node h1 = head1;
        Node h2 = head2;

        while (true){
            if(h1.data == h2.data){
                count++;
                h1 = h1.next;
                if(count == l1){
                    return true;
                }
            }
            else{
                h1 = head1;
                count = 0;

                if(flag){
                    return false;
                }
            }
            if(h2.next == head2){
                flag = true;
            }

            h2 = h2.next;
        }
    }
    public static int height(Node headh){
        if(headh == null){
            return 0;
        }

        int size = 0;
        Node ptr = headh;
        do{
            ptr = ptr.next;
            size++;
        }
        while (ptr != headh);

        return size;
    }
}
