public class multilevel {
    public static void main(String args[]) {
        Dog mydog = new Dog();
        mydog.eat();
        mydog.legs = 4;
        System.out.println("mydog.legs=" + mydog.legs);

    }
}

// Base or Super Class
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

}

class Dog extends Mammal {
    String breed;
}
