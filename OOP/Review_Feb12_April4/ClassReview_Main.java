package OOP.Review_Feb12_April4;
public class ClassReview_Main{
    public static void main(String[] args){
        
        ClassReview_Dog dog1 = new ClassReview_Dog("Bruno", 12);
        dog1.speak();
        ClassReview_Dog dog2 = new ClassReview_Dog("Lion", 11);
        dog2.speak();
        ClassReview_Dog dog3 = new ClassReview_Dog("Bush", 10);
        dog3.speak();

        // getAge() -- non-void
        int dogAge = dog1.getAge();
        System.out.println(dogAge);
        
        // setAge() -- void
        dog1.setAge(32);
        dog1.speak();
    }
}