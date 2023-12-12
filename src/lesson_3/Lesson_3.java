package lesson_3;


import java.util.function.*;

public class Lesson_3 {
    interface Printable {
        void display(int b);
    }

    interface Printable2 {
        int display(int b);
    }

    interface Printable3 {
        void display();
    }

    interface Operation {
        int calculate(int a, int b);
    }

    interface Filter {
        boolean filter(int a);
    }

    public static void main(String[] args) {
        Printable log = (a) -> {
            System.out.println(a);
        };

        Printable log1 = a -> System.out.println(a);
        Printable log2 = System.out::println;

        log.display(1);
        log1.display(2);
        log2.display(3);

        Printable2 log3 = (a) -> {
            int b = a + 1;
            System.out.println(b);
            return b;
        };

        log3.display(3);

        Printable3 log4 = Person::printStatName;
        log4.display();

        Person person = new Person();
        Printable3 log5 = person::printName;
        log5.display();

//  -------------------------------------------------------------
        Operation sum = (a, b) -> a + b;
        int res = sum.calculate(10, 5);
        System.out.println(res);

        calculation(sum, 10, 2);

        int[] array = {-1, -4, 0, 2, 7, 4};
        int sumArray = arraySum(array, a -> a >= 0);
        System.out.println(sumArray);

        //  Базовые функциональные интерфейсы
        Consumer c = System.out::println;
        Function<Integer, String> toString = Object::toString;
        Supplier<Person2> person2 = Person2::new;
        UnaryOperator<Integer> square = a -> a * a;
        BinaryOperator<Integer> binaryOperator1 = (a, b) -> a + b;
        BinaryOperator<Integer> binaryOperator2 = Integer::sum;
    }

    static void calculation(Operation operation, int a, int b) {
        System.out.println(operation.calculate(a, b));

    }

    static int arraySum(int[] array, Filter filter) {
        int sum = 0;
        for (int i : array) {
            if (filter.filter(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
