class Counter{
    int count = 0;
    Counter(){
        count++;
        System.out.println("counter after object is created: "+ count);
    }
}

public class Object {
    public static void main(String [] args){
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();
        Counter obj5 = new Counter();

        //System.out.println("final count: " + Counter.count);
    }
}
