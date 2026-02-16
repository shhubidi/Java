interface SIU{
    void library();
    void sports();
}

interface SIT{
    void engineering();
}

class Cse implements SIU, SIT{
    public void library(){
        System.out.println("SIU library");
    }
    public void sports(){
        System.out.println("SIU sports");
    }
    public void engineering(){
        System.out.println("CSE department");
    }
} 

public class Interface1 {
    public static void main(String[]args){
        SIU a = new Cse();
        a.library();
        a.sports();
        SIT a1 = new Cse();
        a1.engineering();
    }
}
