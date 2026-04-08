package OOP.Review_Feb12_April4;
public class StaticReview_Dog{
    
    // Static Variable - variable that belongs to the class itself rather than to any specific instance (object) of that class
    protected static int count = 0;

    protected String name;
    protected int age;

    public StaticReview_Dog(String name, int age){
        this.name = name;
        this.age = age;
        StaticReview_Dog.count += 1;
        StaticReview_Dog.display();
        //StaticReview_Dog.display2(); ---- there's an error
    }

    // Static Method - that belongs to the class itself rather than to any specific object (instance) of that class
    public static void display(){
        System.out.println("I am a static dog !");
    }

    // Void Method --- returns nothing
    public void display2(){
        System.out.println("I am a dog !");
    }
}