public class DeQueue {
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
    public void deleteFirst() {
        head = head.ref;
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
        DeQueue queue=new DeQueue();
        System.out.println("Queue:");
        queue.addFirst(56);
        queue.addFirst(30);
        queue.addFirst(70);
        queue.print();

        System.out.println("\nQueue List after deleting first element:");
        queue.deleteFirst();
        queue.print();
    }
}