package OOP.Review_Feb12_April4;
public class StaticReview_Dog{
   
    protected static int count = 0; // Static Variable

    protected String name;
    protected int age;

    public StaticReview_Dog(String name, int age){
        this.name = name;
        this.age = age;
        StaticReview_Dog.count += 1;
        StaticReview_Dog.display();
        //StaticReview_Dog.display2(); ---- there's an error
    }

    // Static Method
    public static void display(){
        System.out.println("I am a static dog !");
    }

    public void display2(){
        System.out.println("I am a dog !");
    }
}