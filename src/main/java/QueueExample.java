import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        Women w1 = new Women(1);
        Women w2 = new Women(2);
        Women w3 = new Women(3);
        Women w4 = new Women(4);
        Women w5 = new Women(5);

        Queue<Women> queue = new ArrayBlockingQueue<Women>(3);
        System.out.println(queue.offer(w3));
        System.out.println(queue.offer(w2));
        System.out.println(queue.offer(w4));
        System.out.println(queue.offer(w5));
        System.out.println(queue.offer(w1));


    }
}

class Women {
    private int id;

    public Women(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Women{" +
                "id=" + id +
                '}';
    }
}
