package OOP.All_OOP_Exercise2;
public class Main6{
    public static void main (String[] args){
        
        // Create 2 developers
        Developer dev1 = new Developer("Carlos Kerwillain", 21, "Java");
        Developer dev2 = new Developer("Joseph B. Alhadjie", 23, "SQL Query");

        // Create 1 manager
        Manager man1 = new Manager("Mr. Abdullah Musa", 46, "Software Engineering");

        // Compare developers using equals() & compareTo()
        System.out.println("Are Developers equal? " + (dev1.equals(dev2)));
        System.out.println("CompareTo result: " + (dev1.compareTo(dev2) > 0));

        // Call overloaded methofd
        dev1.code();
        dev2.code(6);
        man1.manage();

        // Print getInfo()
        System.out.println(dev1.getInfo());
        System.out.println(dev2.getInfo());

        // Create Company Object and call Department display method
        Company com1 = new Company ("Kerwillain Ltd.");
        com1.displayDepartment();
        
    }
}