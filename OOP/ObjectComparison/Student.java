package OOP.ObjectComparison;
public class Student implements Comparable<Student> {
    private String name; // Instance Variable

    // Constructor (Parent Class)
    public Student (String name){
        this.name = name;
    }

    // To Check for Equality between objects
    public boolean equals(Student other){
        if (this.name == other.name){
            return true;
        }else{
            return false;
        }
    }

    // Comparison (Length between values)
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }

    // Convert to String
    public String toString(){
        return this.name;
    }

}
