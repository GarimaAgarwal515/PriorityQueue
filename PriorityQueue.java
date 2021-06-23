package Queue;

public class PriorityQueue {
    class node {
        int data;
        node next;
        int priority;
        public node(int data ,int priority) {
            this.data = data;
            next = null;
            this.priority=priority;
        }
    }
    node front;
    node rear;

    public Boolean isEmpty(){
    if(front==null && rear==null)
        return true;
    else
        return false;}
    //decreasing priority
    // special insertion and normal deletion
    public void enqueue(int newnode,  int priority){
        node new_node= new node(newnode, priority);
        if(front==null || new_node.priority>front.priority){
            new_node.next=front;
            front=new_node;
        }
        else {
            node temp = front;
            while(temp.next!=null && temp.next.priority>=new_node.priority){
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }
    }
    public void Dequeue(){
        if(isEmpty())
            System.out.println("empty");
        else
            front=front.next;
    }
    public void Display() {
        node temp=front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
