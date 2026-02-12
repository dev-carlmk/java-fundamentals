package OOP.All_OOP_Exercise3;
public class Child {
    private String name; // Instance Variable
    private char grade;

    // Constructor
    public Child (String name, char grade){
        this.name = name;
        this.grade = grade;
    }

    // play()
    public void play(){
        System.out.println(name + " won't play today because his grade this semester is " + grade);
    }

    // Override toString()
    @Override
    public String toString(){
        return name;
    }

}
