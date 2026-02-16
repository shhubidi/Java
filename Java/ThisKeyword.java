class Student{
    String name;

    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println("name: "+ this.name);
    }
}

public class ThisKeyword {
    public static void main(String [] args){
        Student s = new Student("alice");
        s.display();
    }
}
