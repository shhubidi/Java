

class Parent{
    void display(){
        System.out.println("Parent Display");
    }
}

class ChildOfP extends Parent{
    @Override
    void display(){
        throw new NullPointerException("Unchecked exception allowed");
    }
}