package OOP.All_OOP_Exercise3;
public class Parent{
    protected String name; // Instance Variable
    protected int age;

    // Constructor (parameters)
    public Parent(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method (getInfo())
    public String getInfo(){
        return "Name: " + name + " | Age: " + age;
    }

    // Override toString()
    @Override
    public String toString(){
        return name;
    }

    // Override equals
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Parent other = (Parent) obj;
        return this.name.equals(other.name);
    }

    // Method work() prints
    public void work(){
        System.out.println("Parent is working.");
    }
}