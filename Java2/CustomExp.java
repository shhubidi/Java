class InvalidAgeException extends Exception{
    public InvalidAgeException(String m){
        super(m);
    }
}

public class CustomExp {
    public static void validate(int age)
        throws InvalidAgeException{
            if(age < 18){
                throw new InvalidAgeException("age must be 18 or above");
            }
            System.out.println("valid age:"+ age);
        }
    public static void main(String[]args){
        try{
            validate(12);
        }
        catch (InvalidAgeException e) {
            System.out.println("caught exception: "+ e.getMessage());
        }
    }
}