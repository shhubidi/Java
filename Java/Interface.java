interface Animal{
    void sound();
    void walk();
}

interface Animal1{
    void eat();
}

class Dog implements Animal, Animal1{
    public void sound(){
        System.out.println("Dog barks");
    }
    public void walk(){
        System.out.println("Dog runs");
    }
    public void eat(){
        System.out.println("Dog eats food");
    }
} 

public class Interface {
    public static void main(String[]args){
        Animal a = new Dog();
        a.walk();
        a.sound();
        Animal1 a1 = new Dog();
        a1.eat();
    }
}
