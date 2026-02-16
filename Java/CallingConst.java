class Demo{
    Demo(){
        this("Default constructor");
        // this(9);
    }
    
    Demo(String message){
        System.out.println(message);
    }
    Demo(int no){
        System.out.println(no);
    }
    
}

public class CallingConst{
    public static void main(String[] args){
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}