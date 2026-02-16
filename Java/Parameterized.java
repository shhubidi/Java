class Student{
    String name;
    int age;

    Student(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("name = "+ name + "\nage = "+ age);
    }
}

public class Parameterized {
    public static void main(String [] args){
        Student s1 = new Student("shubham", 19);
        s1.display();
    }
}
