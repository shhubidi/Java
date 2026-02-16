package Java1;
import SciCalc.Calc;

public class Demo1 {
    public static void main(String[]args){
        Calc c = new Calc();
        System.out.println(c.addition(5,5));
        System.out.println(c.subtract(10,5));
        System.out.println(c.multiply(7,5));
        System.out.println(c.divide(15,5));
    }
}
