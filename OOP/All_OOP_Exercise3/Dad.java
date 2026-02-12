package OOP.All_OOP_Exercise3;
public class Dad extends Parent implements Comparable<Dad>{
    protected String jobTitle; // Instance Variable

    // Child Class Constructor
    public Dad(String name, int age, String jobTitle){
        super(name, age);
        this.jobTitle = jobTitle;
    }

    // Add method drive()
    public String drive(){
        return "Dad is driving";
    }

    // Implement compareTo (Dad other)
    public int compareTo(Dad other){
        return this.name.compareTo(other.name);
    }

}
