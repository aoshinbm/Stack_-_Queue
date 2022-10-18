import java.util.Stack;

public class Stack_Add {
    public static void main(String[] args) {
        System.out.println("Stack:");
        Stack stack=new Stack();
        stack.push(70);
        System.out.println(stack);
        stack.push(30);
        System.out.println(stack);
        stack.push(56);
        System.out.println(stack);

        Stack stack1=new Stack();
        stack1.push(56);
        System.out.println(stack1);
        stack1.push(30);
        System.out.println(stack1);
        stack1.push(70);
        System.out.println(stack1);
    }
}