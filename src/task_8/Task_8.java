package task_8;

import java.util.Random;
import java.util.stream.IntStream;

public class Task_8 {
    public static void main(String[] args) {
        IntStream
                .generate(() -> new Random().nextInt(20) - 10)
                .limit(20)
                .filter(i -> i > 0)
                .sorted()
                .forEach(System.out::println);
    }
}
