class Outer{
    class Inner{
        void display(){
            System.out.println("inner class");
        }
    }
}

public class InnerClass {
    public static void main(String [] args){
        Outer.Inner obj = new Outer(). new Inner();
        obj.display();
    }
}
