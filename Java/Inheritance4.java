class Shape{
    void walk(){
    System.out.println("animal walks");
    }
}

class Triangle extends Shape{
    void run(){
        System.out.println("dog runs");
    }
}

class RightAngle extends Triangle{
    void barks(){
        System.out.println("german barks");
    }
}

public class Inheritance4 {
    public static void main(String[] args){
        RightAngle g = new RightAngle();
        g.walk();
        g.run();
        g.barks();
    }
}
