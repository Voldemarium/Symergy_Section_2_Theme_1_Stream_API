package lesson_9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lesson_9 {
    final static int pageSize = 5; // кол-во элементов (на странице сайта)

    public static void main(String[] args) {
//----------------------skip---------------------------
//----------------------limit-------------------------
        IntStream.range(-10, 10)
                .skip(5) // пропускаем 50 элементов
                .limit(10)
                .forEach(System.out::println);

//------------------skip в отображении элементов на страницах-----------
//        ArrayList<Integer> catalog = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            catalog.add(i);
//        }
        ArrayList<Integer> catalog = (ArrayList<Integer>) IntStream.range(0, 100).boxed().collect(Collectors.toList());

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Which page show (enter page number) : ");
            int numberPage = in.nextInt();
            catalog.stream().skip((long) (numberPage - 1) * pageSize) // пропускаем 50 элементов
                    .limit(pageSize)
                    .forEach(System.out::println);
        }
    }
}
