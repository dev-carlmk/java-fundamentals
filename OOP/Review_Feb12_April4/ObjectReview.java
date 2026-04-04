package OOP.Review_Feb12_April4;
import java.util.Scanner;
public class ObjectReview{
    public static void main (String[] args){
        // Objects/Instances -- (sc)
        Scanner sc = new Scanner(System.in);
        String name = "Dev-Legend";
        
        // Methods | Function Output
        sc.next();
        sc.close();
        name.length();
        myInfo("Dev-Carlos",5); // void (returns nothing)
        System.out.println(addition(5)); // returns integer
        System.out.println(momName("Iris Kiazolu")); // returns String
    }

    // Function | Methods 
    public static void myInfo(String fullName, int x){ // void means - "Returns Nothing"
        for(int i = 0; i < x; i++){
            System.out.println(fullName);
        }
    }

    public static int addition (int x){ // means - "Returns Data Type (Integer)"
        return x + 2;
    }

    public static String momName(String mom){ // means - "Return Data Type (String)"
        return mom + "!";
    }
}