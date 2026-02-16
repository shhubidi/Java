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

class GermanShepherd extends Dog{
    void barks(){
        System.out.println("german barks");
    }
}

public class Inheritance3 {
    public static void main(String[] args){
        GermanShepherd g = new GermanShepherd();
        g.walk();
        g.run();
        g.barks();
    }
}
