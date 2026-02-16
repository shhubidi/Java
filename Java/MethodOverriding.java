class Animal{
    void sound(){
        System.out.println("animal makes sound");
    }
    void walk(){
        System.out.println("animal walks");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
    void walk(){
        System.out.println("dog runs");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat meows");
    }
    void walk(){
        System.out.println("cat walks");
    }
}

class Sheep extends Animal{
    @Override
    void sound(){
        System.out.println("sheep baahs");
    }
    void walk(){
        System.out.println("sheep walks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        Animal s = new Sheep();
        d.sound();
        d.walk();
        
        c.sound();
        c.walk();
        
        s.sound();
        s.walk();
    }

}

