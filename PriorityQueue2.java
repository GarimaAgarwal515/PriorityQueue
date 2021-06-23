package Queue;
/* priority queue simple insertion and special deletion
priority queue using linkedlist
descending priority queue

 */

public class PriorityQueue2 {
class Node {
    int data;
    Node next;
    int priority;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        next = null;
    }
}
    Node front;
Node rear;
    public void enqueue(int data, int priority) {
        Node newnode = new Node(data, priority);
        if (front == null && rear == null) {
            front = rear = newnode;
        } else {
            rear.next=newnode;
            rear = newnode;
        }
    }
    public void dequeue() {
        if (front == null) {
            System.out.println("Empty");
        }
        else if(front.priority>front.next.priority){
            front=front.next;
        }
        else{
            Node temp=front;
            while(temp.next!=null && front.next.priority>front.priority) {
                temp = temp.next;
            }
            front.next=front.next.next;
        }
    }
    public void Display() {
       Node temp=front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }






    }



