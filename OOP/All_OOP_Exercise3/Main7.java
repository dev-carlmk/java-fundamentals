package OOP.All_OOP_Exercise3;
public class Main7{
    public static void main (String[] args){
        // Create 1 mom
        Mom iris = new Mom("Iris W Kiazolu", 74, "Beans");
        
        // Create 2 dads
        Dad kerwillain1 = new Dad("Garrison Kerwillain Sr.", 79, "IPC Coordinator");
        Dad kerwillain2 = new Dad ("Garrison Kerwillain Jr.", 80, "Doctor");
        
        // Create 1 child
        Child carlos = new Child ("Carlos Kerwillain", 'A');

        // Parent
         Parent irisgarrison = new Parent("Iris Kiazolu | Garrison Kerwillain", 90);

        // Compare the 2 dads using equals() & compareTo()
        System.out.println("Are dad equal? " + (kerwillain1.equals(kerwillain2)));
        System.out.println("CompareTo result: " + kerwillain1.compareTo(kerwillain2));

        // Call Overloaded cook() methods
        System.out.println(iris.cook());
        System.out.println(iris.cook("Beans"));

        // Call work() methods (to test overriding)
        iris.work();
        irisgarrison.work();

        // Call methods
        System.out.println(kerwillain2.drive());
        carlos.play(); // done

        // Print getInfo() done
        System.out.println(irisgarrison.getInfo());
        System.out.println(iris.getInfo());

        // Create Family object and call displayAddress()
        Family fam1 = new Family ("Kerwillain's");
        fam1.displayAddress();
    }
}