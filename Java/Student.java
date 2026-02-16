class Students{
    String name;
    int age;

    Students(){
        name = "Shubham";
        age = 19;
    }
    void display(){
        System.out.println("name = "+ name + "\nage = "+ age);
    }
};



public class Student {
    public static void main(String [] args){
        Students s1 = new Students();
        s1.display();
    }
}
