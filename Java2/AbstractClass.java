abstract class Parent{
    abstract void display();
    
    void show(){
        System.out.println("parent 2");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("parent 1");
    }
}

public class AbstractClass {
    public static void main(String[]args){
        Child p = new Child();
        p.show();
        p.display();
    }
}
