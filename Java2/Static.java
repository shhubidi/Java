class Counter{
    static int count = 0;

    int co = count++;
    public void display() {
        System.out.println(co);
    }
}

public class Static {
    public static void main(String[]args){
        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c.display();
        c1.display();
        c2.display();
    }    
}
