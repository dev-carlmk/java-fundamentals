public class Person{
    protected String name; // Instance Variable
    protected int age;

    // Constructor (parameters)
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Methods
    public String getInfo(){
        return "Name: " + name + " | Age: " + age;
    }

    public boolean equals(Person other){
        return this.name.equals(other.name);
    }

    @Override
    public String toString(){
        return name;
    }
}