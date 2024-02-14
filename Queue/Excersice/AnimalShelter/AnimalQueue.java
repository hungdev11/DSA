import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs;
    LinkedList<Cat> cats;
    private int order;

    public AnimalQueue(){
        dogs = new LinkedList<Dog>();
        cats = new LinkedList<Cat>();
        order = 0;
    }

    public void enqueue(Animal a)
    {
        a.setOrder(order);
        order++;
        if(a instanceof Dog)
            dogs.addLast((Dog)a);
        else
            cats.addLast((Cat)a);
    }
    public int size()
    {
        return dogs.size() + cats.size();
    }

    public Dog dequeueDog()
    {
        return dogs.poll();
    }
    public Cat dequeueCat()
    {
        return cats.poll();
    }
    public Dog peekDog()
    {
        return dogs.peek();
    }
    public Cat peekCat()
    {
        return cats.peek();
    }

    public Animal dequeueAny()
    {
        if(dogs.size() == 0)
            return this.dequeueCat();
        if(cats.size() == 0)
            return this.dequeueDog();
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if(dog.isOlderThan(cat))
            return dogs.poll();
        else
            return cats.poll();
    }

    public Animal peekAnimal()
    {
        if(dogs.size() == 0)
            return this.peekCat();
        if(cats.size() == 0)
            return this.peekDog();
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if(dog.isOlderThan(cat))
            return dogs.peek();
        else
            return cats.peek();
    }
}
