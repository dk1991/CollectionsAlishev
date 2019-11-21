import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Man> manList = new ArrayList<>();
        Set<Man> manSet = new TreeSet<>();

        addElements(manList);
        addElements(manSet);

        Collections.sort(manList);

        System.out.println(manList);
        System.out.println(manSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Man(1, "Valera"));
        collection.add(new Man(4, "Zina"));
        collection.add(new Man(3, "Anna"));
        collection.add(new Man(2, "Stanislav"));
    }
}

class Man implements Comparable<Man> {
    private int id;
    private String name;

    public Man(int id, String name) {
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

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Man man = (Man) o;

        if (id != man.id) return false;
        return name != null ? name.equals(man.name) : man.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Man o) {
//        if (this.id > o.getId()) {
//            return 1;
//        } else if (this.id < o.getId()) {
//            return -1;
//        } else {
//            return 0;
//        }
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
