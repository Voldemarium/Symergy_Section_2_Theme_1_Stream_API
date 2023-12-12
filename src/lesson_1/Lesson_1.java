package lesson_1;

public class Lesson_1 {
    static int catSayCounter = 0;

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Duck duck = new Duck();
//        cat.say();
//        dog.say();
//        duck.say();
       Animal cat = new Animal() {
           @Override
           public void say() {
               System.out.println("mew");
               catSayCounter++;
               System.out.println(catSayCounter);
           }
       };
       cat.say();
        Animal dog = new Animal() {
            @Override
            public void say() {
                System.out.println("gav");
            }
        };
        dog.say();
        Animal duck = new Animal() {
            @Override
            public void say() {
                System.out.println("krya");
            }
        };
        duck.say();
    }
}
