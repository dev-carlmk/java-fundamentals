package OOP.All_OOP_Exercise2;
public class Developer extends Employee implements Comparable<Developer>{
    protected String programmingLanguage; // Instance Variable

    // Child Class Constructor
    public Developer(String name, int age, String programmingLanguage){
        super (name, age);
        this.programmingLanguage = programmingLanguage;
    }

    // Override getInfo() method
    @Override
    public String getInfo(){
        return "Name: " + name + " | Age: " + age + " | Programming Language: " + programmingLanguage;
    }

    // Overloading Methods
    public void code(){
        System.out.println(name + " is coding using " + programmingLanguage + " Programming Language.");
    }
    public void code(int hours){
        System.out.println(name + " coded " + programmingLanguage + " Programming Language for " + hours + " hours.");
    }

    public int compareTo(Developer other){
        return this.name.compareTo(other.name);
    }

}