class Parent{
    void display(){
        System.out.println("Parent class method");
    }
}
class Child extends Parent{
void display(){
    super.display();
    System.out.println("child class method");
}
}

public class SuperKeyword {
    public static void main(String[]args){
        Child c = new Child();
        c.display();
    }
}
