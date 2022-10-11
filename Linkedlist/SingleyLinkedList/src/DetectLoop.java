import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class DetectLoop {
    Node head;

    public class Node{
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void add(int d){
        Node newNode = new Node(d);
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

    public void createloop() {
        Node ptr = head;
        while(ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = head;

    }
    public void DetechLoop(){
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Found loop");
        }
        else {
            System.out.println("Not found loop");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DetectLoop list = new DetectLoop();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        list.createloop();
        System.out.println();
        list.DetechLoop();

    }
}
