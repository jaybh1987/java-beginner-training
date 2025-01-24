# java-beginner-training
public class Main{
public static void main(String args[]) {
Fish shark = new Fish();
shark.eat();
shark.swim();
}
}
//Base class
class Animal{
String color;

void eat() {
System.out.println("eats");
}
void breathe() {
System.out.println("breathes");
}
}
//Derived class
class Fish extends Animal{
int fins;

void swim(){
System.out.println("swims in water");
}
}
