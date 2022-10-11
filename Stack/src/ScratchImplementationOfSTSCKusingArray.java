import java.util.Scanner;

public class ScratchImplementationOfSTSCKusingArray {

     int size;
     int[] arr;
     int top;

     ScratchImplementationOfSTSCKusingArray(int n) {
          this.size = n;
          this.arr = new int[size];
          this.top = -1;
     }

     public void push(int d) {
          if(isFull()){
               System.out.println("Stack is OverFlow");
               return;
          }
          top++;
          arr[top] = d;
          System.out.println("Add element into stack is : " + d);
     }
     public boolean isFull() {
          return (size - 1 == top);
     }
     public void peek(){
          if(top == -1){
               System.out.println("Stack is Empty");
               return;
          }
          System.out.println("peek element is : " + arr[top]);
     }
     public void pop(){
          if(isEmpty()){
               System.out.print("Stack is Underflow");
               return;
          }
          System.out.print("Pop element is : " + arr[top]);
          top = top - 1;
     }
     public boolean isEmpty(){
          return top == -1;
     }
     public void printStack(){
          if(top == -1){
               System.out.print("Stack is empty");
               return;
          }
          System.out.print("Stack is : ");
          for(int i = 0; i < top + 1; i++){
               System.out.print(arr[i] + " ");
          }
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
          ScratchImplementationOfSTSCKusingArray st = new ScratchImplementationOfSTSCKusingArray(10);
          for(int i = 0;i < n; i++){
               st.push(sc.nextInt());
          }
//          st.push(5);
//          st.push(4);
//          st.push(2);
//          st.push(1);
//          st.push(6);
//          st.push(3);
          st.printStack();
          System.out.println();
          st.peek();
          System.out.println();
          st.pop();
          System.out.println();
          st.printStack();
          System.out.println();
          st.peek();
          System.out.println();
          st.pop();
          System.out.println();
          st.printStack();
          System.out.println();
          st.peek();

     }
}
