import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Create_Queue {
    Node head;
    class Node {
        int data;
        Node ref;

        Node(int data) {
            this.data = data;
        }
    }
    void addFirst(int data) {
        Node newNode = new Node(data); // newNode=>[5|null]
        newNode.ref = head;
        head = newNode;
    }
    void display() {
        if (head == null)
            System.out.println("Linked list is empty");
        else {
            Node temp = head;
            while (temp != null) {
                if (temp.ref != null)
                    System.out.println("["+temp.data+"]");
                else
                    System.out.println("["+temp.data+"]");
                temp = temp.ref;
            }
        }
    }
    public static void main(String[] args) {
        Create_Queue queue=new Create_Queue();
        System.out.println("Queue:");
        queue.addFirst(56);
        queue.addFirst(30);
        queue.addFirst(70);
        queue.display();
    }
}