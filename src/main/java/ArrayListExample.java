import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        System.out.println(list);
        System.out.println("size: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer x : list) {
            System.out.println(x);
        }

        list.remove(4); // [1,2,3,4,5] удаляется 5 [1,2,3,4]
        list.remove(2); // [1,2,3,4,5] удаляется 3 [1,2,,4,5] потом все элементы сдвигаются влево на 1 позицию

        System.out.println(list);

        // мы проводим много удалений из нашего листа
        list = new LinkedList<>();
    }
}
