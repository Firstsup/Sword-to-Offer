package N9;

import java.util.LinkedList;
import java.util.Queue;

public class N9Q2 {
    public static void main(String[] args) {
        Queue<Object> queue1 = new LinkedList<>();
        Queue<Object> queue2 = new LinkedList<>();
        functionAppend(queue1, queue2, "a");
        functionAppend(queue1, queue2, "b");
        functionAppend(queue1, queue2, "c");
        functionAppend(queue1, queue2, "d");
        functionDelete(queue1, queue2);
        functionDelete(queue1, queue2);
        functionAppend(queue1, queue2, "e");
        functionDelete(queue1, queue2);
        functionDelete(queue1, queue2);
        functionDelete(queue1, queue2);
    }

    public static void functionAppend(Queue<Object> queue1, Queue<Object> queue2, Object object) {
        if (queue1.size() == 0 && queue2.size() == 0) {
            queue1.offer(object);
        } else if (queue1.size() == 0) {
            queue2.offer(object);
        } else if (queue2.size() == 0) {
            queue1.offer(object);
        }
    }

    public static void functionDelete(Queue<Object> queue1, Queue<Object> queue2) {
        if (queue1.size() == 0) {
            while (queue2.size() > 1) {
                queue1.offer(queue2.element());
                queue2.poll();
            }
            System.out.println(queue2.element());
            queue2.poll();
        } else if (queue2.size() == 0) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.element());
                queue1.poll();
            }
            System.out.println(queue1.element());
            queue1.poll();
        }
    }
}
