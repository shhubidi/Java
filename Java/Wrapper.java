public class Wrapper {
    public static void main(String[] args){
        int x = 5;
        Integer wrappedX = Integer.valueOf(x);
        int unwrappedX = wrappedX.intValue();
        System.out.println("wrapped: "+wrappedX+"\nunwrapped: "+unwrappedX);
    }
}
