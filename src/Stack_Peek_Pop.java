import java.util.Stack;

public class Stack_Peek_Pop {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println("Stack: \t"+stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}