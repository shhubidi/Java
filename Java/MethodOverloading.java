class Calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int sub(int a, int b){
        return a-b;
    }
    double sub(double a, double b){
        return a-b;
    }
    int sub(int a, int b, int c){
        return a-b-c;
    }
    int mul(int a, int b){
        return a*b;
    }
    double mul(double a, double b){
        return a*b;
    }
    int mul(int a, int b, int c){
        return a*b*c;
    }
    int div(int a, int b){
        return a/b;
    }
    double div(double a, double b){
        return a/b;
    }
    int div(int a, int b, int c){
        return a/b/c;
    }
}


public class MethodOverloading {
    public static void  main(String[] args){
        Calculator calc = new Calculator();

        System.out.println("\nADDITION");
        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5.5,2.2));
        System.out.println(calc.add(5,10, 15));

        System.out.println("\nSUBTRACTION");
        System.out.println(calc.sub(5,10));
        System.out.println(calc.sub(5.5,2.2));
        System.out.println(calc.sub(15,10, 5));

        System.out.println("\nMULTIPLICATION");
        System.out.println(calc.mul(5,10));
        System.out.println(calc.mul(5.5,2.2));
        System.out.println(calc.mul(5,10, 15));
        
        System.out.println("\nDIVISION");
        System.out.println(calc.div(10,5));
        System.out.println(calc.div(5.5,2.2));
        System.out.println(calc.div(15,10, 5));
    }
}