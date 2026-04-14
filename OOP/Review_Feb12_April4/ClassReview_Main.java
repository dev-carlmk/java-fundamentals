package OOP.Review_Feb12_April4;
public class ClassReview_Main{
    
    //Main Class - method is where the program starts running 
    public static void main(String[] args){
        
        //Dog Class
        ClassReview_Dog dog1 = new ClassReview_Dog("Bruno", 12);
        dog1.speak();
        ClassReview_Dog dog2 = new ClassReview_Dog("Lion", 11);
        dog2.speak();
        ClassReview_Dog dog3 = new ClassReview_Dog("Bush", 10);
        dog3.speak();

        // Cat Class
        InheritanceReview_Cat cat1 = new InheritanceReview_Cat("Kitty", 2, 4);
        cat1.speak();

        // Static Dog Class
        StaticReview_Dog staticDog1 = new StaticReview_Dog(null, 0);
        StaticReview_Dog staticDo2 = new StaticReview_Dog(null, 0);
        StaticReview_Dog staticDog3 = new StaticReview_Dog(null, 0);
        System.out.println(StaticReview_Dog.count);


        // getAge() -- non-void
        int dogAge = dog1.getAge();
        System.out.println(dogAge);
        
        // setAge() -- void
        dog1.setAge(32);
        dog1.speak();
    }
}