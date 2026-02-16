abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("message");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

public class AbstractExample {
    public static void main(String [] args){

    }
}
