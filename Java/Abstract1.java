abstract class SIU{
    abstract void library();
    abstract void engineering();
}

class SIT extends SIU{
    void library(){
        System.out.println("SIU library");
    }
    void engineering(){
        System.out.println("CSE department");
    }
}

public class Abstract1 {
    public static void main(String [] args){
        SIU a = new SIT();
        a.library();
        a.engineering();
    }
}
