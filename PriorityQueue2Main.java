package Queue;

public class PriorityQueue2Main {
    public static void main(String[] args) {
        PriorityQueue2 obj = new PriorityQueue2();
        obj.enqueue(90,10);
        obj.enqueue(100,11);
        obj.enqueue(80,9);
        obj.enqueue(70,12);
        obj.enqueue(95,5);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();


        obj.Display();

    }
}
