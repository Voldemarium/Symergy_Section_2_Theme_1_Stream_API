package task_9;

import java.util.List;

public class Task_9 {
    public static void main(String[] args) {
//У вас есть список моделей смартфонов, "iPhone 6S", "Lumia 950", "Samsung Galaxy S6", "LG G4", "Nexus7",
      //вам нужно вывести в консоль названия двух моделей пропустив при этом первый бренд при помощи
        // метода skip и limit
        List<String> phones = List.of("iPhone 6S", "Lumia 950", "Samsung Galaxy S6", "LG G4", "Nexus7");
        phones.stream().skip(1).limit(2).forEach(System.out::println);
    }
}
