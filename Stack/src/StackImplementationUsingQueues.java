import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackImplementationUsingQueues {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void push(int d) {

        System.out.println("Add element into stack is : " + d);
        q2.add(d);

        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;

    }
    public static void display(){
        System.out.println("Stack is : " + q1);
    }
    public static void pop() {
        if(q1.isEmpty()){
            System.out.println();
        }
        int p = q1.remove();
        System.out.println("pop element is : " + p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i < n; i++) {
            push(sc.nextInt());
        }
        display();
        System.out.println();
        System.out.println("top element is : " + q1.peek());
        System.out.println();
        pop();
        System.out.println();
        display();
    }
}
