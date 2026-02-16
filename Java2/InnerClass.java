class Outer{
    class Inner{
        public void display(){
            System.out.println("Inner class");
        }
    }
}

public class InnerClass {
    public static void main(String [] args){
        Outer.Inner obj = new Outer().new Inner();
        obj.display();
    }
}
