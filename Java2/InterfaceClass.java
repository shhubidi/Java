interface Father{
    abstract void display();
}
interface Mother{
    abstract void show();
}

class Child implements Father, Mother{
    public void display(){
        System.out.println("father");
    }
    public void show(){
        System.out.println("mother");
    }
}

public class InterfaceClass {
    public static void main(String[]args){
        Child c = new Child();
        c.display();
        c.show();
    }
}
