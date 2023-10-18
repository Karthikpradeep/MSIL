package p1;
class Student{
    String name;
    int age;
    int height;
    public Student(String name,int age){
        this.name= name;
        this.age = age;
    }
    public Student(int height){
        this.height = height;
    }
}
public class constructorExample {
    public static void main(String[] args) {
        Student s= new Student("Arjun",23);
        System.out.println(s.name+" "+s.age);
    }
}
