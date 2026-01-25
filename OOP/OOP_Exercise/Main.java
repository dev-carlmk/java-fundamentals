package OOP.OOP_Exercise;
public class Main {
    public static void main(String[] args) {
        
        // Create Objects
        Phone normalPhone = new Phone("Nokia", "2005");
        SmartPhone iPhone = new SmartPhone ("iPhone 13", "2021", "iOS" );
        
        // Call Methods
        System.out.println(normalPhone.description());
        System.out.println(iPhone.description());
        
        // Print Static Variable
        System.out.println("Total Phones created: " + Phone.count);
    }
}