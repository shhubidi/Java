class Parent{
    void display(){
        System.out.println("Parent walks");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("child runs");
    }
}

class Sibling extends Child{
    void runs(){
        System.out.println("sibling runs");
    }
}

public class Inheritance2 {
    public static void main(String[] args){
        Sibling s = new Sibling();
        s.display();
        s.show();
        s.runs();
    }
}
