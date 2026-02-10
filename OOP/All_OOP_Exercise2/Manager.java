package OOP.All_OOP_Exercise2;
public class Manager extends Employee{
    protected String department; // Instance Variable

    // Child Class Constructor 
    public Manager (String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    // Override getInfo() method
    @Override
    public String getInfo(){
        return "Name: " + name + " | Age: " + age + " | Department: " + department;
    }

    // Create manage() method
    public void manage(){
        System.out.println(name + " is the HoD for the " + department + " department.");
    }
}