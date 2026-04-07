package Java1;

import addmethods.AddDemo;

class A{
    protected int i = 55;
    private int j = 9;
    protected int k = 30;
    int d = 99;

    void display(){
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}

class B extends A{
    void bDisplay(){
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(d);
    }
}

public class mycalca {
    public static void main(String[]args){
        System.out.println("Hello SYCSE C division!!");
        AddDemo adinotherpck = new AddDemo();
        adinotherpck.i = 0;
         adinotherpck.j = 0;
          adinotherpck.k = 0;
    }
}


