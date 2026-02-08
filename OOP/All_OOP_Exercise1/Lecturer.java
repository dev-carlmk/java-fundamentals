public class Lecturer extends Person{
    protected String department; // Instance Variable

    // Constructor (parameters)
    public Lecturer (String name, int age, String department){
        super (name, age); // Parent Class (Constructor)
        this.department = department;
    }

    // Override getInfo() method
    @Override
    public String getInfo(){
        return "Name: " + name + " | Age: " + age + " | Department: " + department;
    }

    public void teach(){
        System.out.println(name + " is teaching in the " + department + " department.");
    }

}