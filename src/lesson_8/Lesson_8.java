package lesson_8;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson_8 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.generate(() -> new Random().nextInt(10))
                .limit(10);
//---------filter()-------------------------
        intStream.filter(a -> a > 2)
                .filter(a -> a < 8)
//---------sorted() для чисел (IntStream, LongStream, DoubleStream)-------------------------
                .sorted()
// ---------forEach()-------------------------
                .forEach(System.out::println);

// ---------sorted() для объектов -------------------------
        Stream<Person1> stream1 = Stream.of(
                new Person1("user1"),
                new Person1("user3"),
                new Person1("user2"));
        stream1.sorted()
                .forEach(System.out::println);

        Stream<Person2> stream2 = Stream.of(
                new Person2("user4"),
                new Person2("user6"),
                new Person2("user5"));
        stream2.sorted(new Person2Comparator())
                .forEach(System.out::println);

        Stream<Person2> stream3 = Stream.of(
                new Person2("user9"),
                new Person2("user8"),
                new Person2("user7"));
        stream3.sorted(Comparator.comparing(person2 -> person2.name))
                .forEach(System.out::println);

    }
}
