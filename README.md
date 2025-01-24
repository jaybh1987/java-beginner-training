# java-beginner-training
public class Main{
public static void main(String args[]) {
Fish shark = new Fish();
shark.eat();
shark.swim();
}
}
class Animal{
string color;

void eat() {
System.out.println("eats");
}
void breath() {
System.out.println("breathes");
}
}

class Fish exteds Animal{
int fins;

void swim(){
System.out.println("swims in water");
}
}
