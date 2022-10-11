import java.util.Scanner;

public class ScratchImplementationOfQueueUsingArray {
    int front,rear;
    int capcity;
    int queue[];
    ScratchImplementationOfQueueUsingArray(int c){
        front = rear = 0;
        capcity = c;
        queue = new int[capcity];
    }

    public void enqueue(int d) {
        if(rear == capcity) {
            System.out.println("Queue is overflow");
            return;
        }

        queue[rear] = d;
        rear++;
        System.out.println("Add element in queue : " + d);
    }
    public void printList(){
        if(rear == front){
            System.out.print("Queue is empty");
            return;
        }
        System.out.println("Queue is : ");
        for(int i = front; i < rear; i++){
            System.out.print(" <-- " + queue[i]);
        }
    }
    public void dequeue() {
        if(rear == front) {
            System.out.print("Queue is UnderFlow");
            return;
        }
        System.out.print("Dequeue element is : " + queue[front]);
        for(int i = 0; i < rear -1; i ++) {
            queue[i] = queue[i + 1];
        }
        if(rear < capcity){
            queue[rear] = 0;
        }
        rear--;
    }
    public void queueFront() {
        if(rear == front) {
            System.out.print("Queue is Empty");
            return;
        }
        System.out.print("Front element is : " + queue[front]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScratchImplementationOfQueueUsingArray qu = new ScratchImplementationOfQueueUsingArray(10);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            qu.enqueue(sc.nextInt());
        }
        qu.printList();
        System.out.println();
        qu.queueFront();
        System.out.println();
        qu.dequeue();
        System.out.println();
        qu.printList();
        System.out.println();
        qu.queueFront();
    }
}
