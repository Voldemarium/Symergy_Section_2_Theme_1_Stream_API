package task_7;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Task_7 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("I", "love", "Java");
        String str = stream.collect(Collectors.joining(" "));
        System.out.println(str);
    }
}
