package lesson_7;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lesson_7 {
    public static void main(String[] args) {
// --------------IntStream-----------------------------------------------
        int[] array = {-4, 3, 2, -1, 5, 8};
        System.out.println(Arrays.toString(array));
        System.out.println(IntStream.of(array)
                .filter(a -> a > 0)
                .peek(System.out::println)  // peek - подглядывание
                .sum());

//        IntStream.generate(() -> 1).forEach(System.out::println);
        IntStream.of(10).forEach(System.out::println);
        IntStream.range(1, 10).forEach(System.out::print);     // числа от 1  до 10 (10 не включительно)
        System.out.println();
        IntStream.rangeClosed(1, 10).forEach(System.out::print);// (включительно 10)
        System.out.println();

       int sumRandomInt = IntStream
               .generate(() -> new Random().nextInt(10))
               .limit(10)
               .peek(System.out::println)
               .sum();
        System.out.println("sumRandomInt = " + sumRandomInt);
// --------------Stream-----------------------------------------------
        Stream.of(new Person("user1"), new Person("user2"), new Person("user3"))
                .forEach(System.out::println);
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Olya"));
        list.add(new Person("Vasya"));
        list.add(new Person("Petr"));
        list.stream().forEach(System.out::println);

    }
}
