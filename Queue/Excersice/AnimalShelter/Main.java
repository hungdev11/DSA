public class Main {
    public static void main(String[] args) {
        AnimalQueue aq = new AnimalQueue();
        aq.enqueue(new Cat("Mew Mew"));
        aq.enqueue(new Cat("Tom"));
        aq.enqueue(new Dog("Kow maw"));
        aq.enqueue(new Cat("Miu"));
        aq.enqueue(new Dog("Mundo"));

        System.out.println(aq.dequeueCat().name);
        System.out.println(aq.dequeueDog().name);
        System.out.println(aq.dequeueAny().name);
        System.out.println(aq.size());

    }
    
}