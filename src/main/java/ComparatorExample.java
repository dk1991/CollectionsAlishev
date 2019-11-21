import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Persons> people = new ArrayList<>();
        people.add(new Persons(3,"Vera"));
        people.add(new Persons(1,"Bob"));
        people.add(new Persons(4,"Dima"));
        people.add(new Persons(2,"Igor"));

        Collections.sort(people, new Comparator<Persons>() {
            @Override
            public int compare(Persons o1, Persons o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);

//        List<String> animals = new ArrayList<>();
//        animals.add("lion");
//        animals.add("dog");
//        animals.add("crocodile");
//        animals.add("frog");
//        animals.add("elephant");
//        animals.add("tiger");
//
//        Collections.sort(animals);
//        System.out.println(animals);
//
//        Collections.sort(animals, new StringLengthComparator()); // сортировка по нашей логике
//        System.out.println(animals);

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(35);
//        numbers.add(15);
//        numbers.add(500);
//        numbers.add(5000);
//        numbers.add(150);
//        numbers.add(5);

//        Collections.sort(numbers, new BackwarddsIntegerComparator());
//        System.out.println(numbers);

//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2) {
//                    return -1;
//                } else if (o1 < o2) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(numbers);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
            o1 > o2 => 1
            o1 < 02 => -1
            o1 == 02 => 0

            compare(2, 1) => 1
            ompare(2, 9) => -1
            compare(3,3) => 0
         */
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwarddsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Persons {
    private int id;
    private String name;

    public Persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}
