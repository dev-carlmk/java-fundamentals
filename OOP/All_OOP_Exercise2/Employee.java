package OOP.All_OOP_Exercise2;
public class Employee {
    protected String name; // Instance Variables
    protected int age;

    // Constructor (parameters)
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Methods
    public String getInfo(){
        return "Name: " + name + " | Age: " + age;
    }

    // Override toString() method
    @Override
    public String toString(){
        return name;
    }

    // Override equals() to compare names
    public boolean equals(Employee other){
        return this.name.equals(other.name);
    }


}