package addmethods;

public class AddDemo {
    public int i = 10;
    private int j = 11;
    int k = 12;
    protected int l = 123;

    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[]args){
        AddDemo d = new AddDemo();
        System.out.println(d.i);
        System.out.println(d.j);
        System.out.println(d.k);
        System.out.println(d.l);
    }
    protected void addProtected(int a, int b){
        System.out.println(a+b);
    }
}
