package OOP.Review_Feb12_April4;
public class ClassReview_Dog{
    private String name;
    private int age;

    // Constructor (parameters)
    public ClassReview_Dog(String name, int age){
        this.name = name;
        this.age = age;
        add2(); // it works because the method exists in the same Class
    }

    public void speak(){
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old.");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    private int add2(){
        return this.age + 2;
    }
}
