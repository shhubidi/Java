class Parent{
    final void display(){
        System.out.println("message");
    }
}
class Child extends Parent{
    // void display(){}
} 

public class ParentClass {
    public static void main(String[]args){
        Child c = new Child();
        c.display();
    }
}
