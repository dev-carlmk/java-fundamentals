package OOP.Static;

public class Class {
    protected static int count = 0; // Static/Class Variable
    protected static int legs = 2;
    protected String teacher; // Instance Variable
    protected int age;
    
    // Class Constructor
    public Class (String teacher, int age){
        this.teacher = teacher;
        this.age = age;
        Class.count += 1; 
    }

    // Static Methods
    public static void display(){
    System.out.println("This is a Static Method");
    }

    public void speak(){
        System.out.println("My name is " + this.teacher + ", and I'm " + this.age + " years old. I have " + Class.legs + " legs.");
    }

}
