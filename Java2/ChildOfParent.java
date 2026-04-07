import java.io.IOException;

class Parent{
    void readFile() throws IOException{
        System.out.println("Parent reading file in parent");
    }
}

class ChildOfParent extends Parent{
    @Override
    void readFile() throws IOException{
        throw new NullPointerException("reading file in child");
    }
}