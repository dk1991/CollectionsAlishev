import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // нет гарантии порядка внутри

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // в каком порядке пары ключ-значение были добавлены,в таком и вернутся

        Map<Integer, String> treeMap = new TreeMap<>(); // сортировка по ключу (для ключа (нужен критерий для сортировки)

        testMap(treeMap);


        /*Map<Integer,String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(31, "Sanya");
        map.put(77, "Oleg");
        map.put(12, "Biba");
        map.put(99, "Boris");
        map.put(0, "Ben");
        map.put(1600, "Vera");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
