package lesson_8;

public class Person1 implements Comparable<Person1> {
    String name;

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person1 person) {
        return this.name.compareTo(person.name) ;
    }
}
