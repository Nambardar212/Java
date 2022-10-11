import java.util.Scanner;
import java.util.Stack;

public class QueueImplementationUsingStacks {
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            enqueue(sc.nextInt());
        }
        display();
        peek();
        dequeue();
        display();
        peek();
    }
    public static void enqueue(int d){
        System.out.println("Add element into queue is : " + d);
        while(!st1.isEmpty()){
                st2.push(st1.pop());
        }
        st1.push(d);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    public static void display(){
        System.out.println("queue is : " + st1);
    }
    public static void peek(){
        System.out.println("front element is : " + st1.peek());
    }
    public static void dequeue(){
        int p = st1.pop();
        System.out.println("Dequeue element is : " + p);
    }
}
