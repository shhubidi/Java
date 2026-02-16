class Student{
    String name;
    int age;

    Student(){
        name="shubham";
        age=19;
    }
    Student(String name){
        this.name = name;
    }
    Student(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("name: "+ name + " age: "+ age);
    }
    void show(){
        System.out.println("name: "+ this.name + " age: "+ age);
    }
}

public class Constructor {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Shubh", 19);
        s2.display();
        Student s3 = new Student("shubidi");
        s3.show();
    }
}
