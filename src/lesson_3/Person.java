package lesson_3;

public class Person {
    String name = "Vasya";
    static String statName = "VASYA";

    void printName() {
        System.out.println(this.name);
    }
    static void printStatName() {
        System.out.println(statName);
    }
}
