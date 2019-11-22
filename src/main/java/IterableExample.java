import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int id = 0;
        // Before Java 5
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (id == 1) {
                iterator.remove();
            }

            id++;
        }
        System.out.println(list);

        // Java 5
        for (int x : list) {
            System.out.println(x);
        }
    }
}
