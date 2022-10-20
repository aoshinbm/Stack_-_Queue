import java.util.Stack;

public class Stack_Add {
    Node head;

    class Node {
        int data;
        Node ref;

        Node(int data) {
            this.data = data;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (head.ref == null) {
            head.ref = newNode;
        } else {
            Node temp = head;
            while (temp.ref != null) {
                temp = temp.ref;
            }
            temp.ref = newNode;
        }
    }
    void print(){
        if (head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node temp=head;
            while (temp!=null){
                if (temp.ref!=null){
                    System.out.println("["+temp.data+"]");
                }
                else {
                    System.out.println("["+temp.data+"]");
                }
                temp=temp.ref;
            }
        }
    }
    public static void main(String[] args) {
        Stack_Add stack=new Stack_Add();
        System.out.println("Stack ");
        stack.addLast(70);
        stack.addLast(30);
        stack.addLast(56);
        stack.print();

    }
}