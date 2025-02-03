public class Multipath {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.feedMilk();
    }
}

interface Animal {
    void eat();

    void sleep();
}

interface Mammal {
    void feedMilk();
}

class Dog implements Animal, Mammal {

    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public void feedMilk() {
        System.out.println("Dog is feeding milk.");
    }
}