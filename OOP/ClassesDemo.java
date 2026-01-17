package OOP;
public class ClassesDemo {
    private String name;
    private int age;

    public ClassesDemo (String name, int age){
        this.name = name;
        this.age = age;
        addition();
    }

    public void speak(){
        System.out.println("I am " + this.name + " and I am " + this.age + " years old.");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge (int age){
        this.age = age;
    }

    private void addition (){
    }
}