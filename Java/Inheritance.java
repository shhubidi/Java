class Animal{
    void walk(){
    System.out.println("animal walks");
    }
}

class Dog extends Animal{
    void run(){
        System.out.println("dog runs");
    }
}

class Cat extends Animal{
    void sleep(){
        System.out.println("cat sleeps");
    }
}

class Puppy extends Dog{
    void barks(){
        System.out.println("puppy barks");
    }
}

public class Inheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.walk();
        d.run();
        
        Puppy p = new Puppy();
        p.barks();
        
        Cat c = new Cat();
        c.sleep(); 
    }
}
