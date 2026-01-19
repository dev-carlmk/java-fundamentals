package OOP.ClassesExercise;
public class Student {
    private String name;
    private int age;
    private String course;

    public Student (String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void studentInfo(){
        System.out.println("My name is: " + name + ". \nI am " + age + " years old. \nI am studying " + course + " at ULK.");
    }

}
