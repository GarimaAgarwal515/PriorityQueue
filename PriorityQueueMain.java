package Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        PriorityQueue obj = new PriorityQueue();
        obj.enqueue(10, 8);
        obj.enqueue(20, 6);
        obj.enqueue(30, 7);
        obj.enqueue(50,9);
        obj.enqueue(100,10);
        obj.enqueue(60,0);
        obj.Dequeue();


        obj.Display();
    }
}
