public class hierarchial {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println("dobby.legs = " + dobby.legs);
    }

}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}