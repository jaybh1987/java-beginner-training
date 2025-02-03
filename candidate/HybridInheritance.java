public class HybridInheritance {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.name = "Bulldog";
        myDog.eat();
        myDog.breathe();
        myDog.walk();
        myDog.bark();

        System.out.println();

        Shark myShark = new Shark();
        myShark.name = "White shark";
        myShark.eat();
        myShark.breathe();
        myShark.swim();
        myShark.hunt();
    }
}

class Animal {
    String name;

    void eat() {
        System.out.println(name + " eats food.");
    }

    void breathe() {
        System.out.println(name + " breathes.");
    }
}

interface Swimmable {
    void swim();
}

class Mammal extends Animal {
    void walk() {
        System.out.println(name + " walks on land.");
    }
}

class Fish extends Animal implements Swimmable {
    public void swim() {
        System.out.println(name + " swims in water.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println(name + " barks.");
    }
}

class Shark extends Fish {
    void hunt() {
        System.out.println(name + " hunts smaller fish.");
    }
}
