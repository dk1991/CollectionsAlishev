import java.util.*;

public class HashCodeAndEqualsExample {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1,"Oleg");
        Person person2 = new Person(1,"Oleg");

        map.put(person1,"First");
        map.put(person2,"First");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}
