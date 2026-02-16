import java.util.Scanner;

class Bank{
    void amount(){
        Scanner sc = new Scanner(System.in);
        
    }
}

class Savings extends Bank{

}

class Current extends Bank{

}

public class Inheritance5 {
    public static void main(String [] args){
        Bank b = new Bank();
        Savings s = new Savings();
        Current c = new Current();    
    }
}
