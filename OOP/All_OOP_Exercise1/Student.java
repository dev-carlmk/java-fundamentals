public class Student extends Person implements Comparable<Student>{
    protected String major; // Instance Variable

    // Constructor 
    public Student (String name, int age, String major){
        super (name, age); // Parent Class Constructor
        this.major = major;
    }

    // Override getInfo() method
    @Override
    public String getInfo(){
        return "Name: " + name + " | Age: " + age + " Major: " + major;
    }

    // Overload study() method
    public void study(){
        System.out.println(name + " is studying " + major + ".");
    }
    public void study (int hours){
        System.out.println(name + " studied " + major + " for " + hours + " hours.");
    }

    // Object Comparison
    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }
}