import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(11);
//        System.out.println(myLinkedList);
//
//        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(0);
        System.out.println(myLinkedList);

//        List<Integer> linkedList = new LinkedList<>();
//        List<Integer> arrayList = new ArrayList<>();
//
//        measureTime(linkedList);
//        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
