abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("this animal eats food");
    }
    abstract void run();
}
class Dog extends Animal{
    void sound(){
        System.out.println("this animal barks");
    }
    void run(){
        System.out.println("this animal runs");
    }
}

public class AbstractMethod {
    public static void main(String[]args){
        Animal animal = new Dog();
        animal.sound();
        animal.eat();
        animal.run();
    }
}
