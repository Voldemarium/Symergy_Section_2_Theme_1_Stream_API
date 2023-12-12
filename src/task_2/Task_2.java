package task_2;

import java.util.function.Function;

public class Task_2 {
    public static void main(String[] args) {
        /*      Написать лямбда выражение,которое принимает на вход число и возвращает значение “Положительное число”,
        “Отрицательное число” или “Ноль”. Используем функциональный интерфейс Function
         */
        Function<Integer, String> markNumber = a -> {
            String str;
            if(a < 0) {
                str = "Отрицательное число";
            } else if(a >  0) {
                str = "Положительное число";
            } else {
                str = "Ноль";
            }
            return str;
        };
        System.out.println(markNumber.apply(1));
        System.out.println(markNumber.apply(-4));
        System.out.println(markNumber.apply(0));
    }
}
