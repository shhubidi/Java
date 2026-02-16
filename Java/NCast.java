public class NCast {
    public static void main(String args[]){
        double Mydouble = 9.78d;
        int myInt = (int)Mydouble;

        System.out.println(Mydouble);
        System.out.println(myInt);

        //widening casting
        int myInt1 = 9;
        double myDouble = myInt1;
        System.out.println(myDouble);
    }
}
