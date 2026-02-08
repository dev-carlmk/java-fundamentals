public class Main5{
    public static void main (String[] args){
        // Create 2 Students
        Student st1 = new Student("Carlos Kerwillain", 21, "Software Engineering");
        Student st2 = new Student ("Destiny F. Kerwillain", 20, "Public Administration");

        // Create 1 Lecturer
        Lecturer l1 = new Lecturer("Mr. Truth Legend", 49, "Computer Science (CSSE)");

        // Compare Student using equals() & compareTo()
        System.out.println("Are student equal? " + st1.equals(st2));
        System.out.println("CompareTo result: " + (st1.compareTo(st2) > 0));

        // Call Overloaded Methods
        st1.study();
        st2.study(7);

        // Print getInfo() for all
        System.out.println(st1.getInfo());
        System.out.println(st2.getInfo());
        System.out.println(l1.getInfo());

        // Create University Object
        University uni = new University("Kigali Independent University (ULK)");
        uni.showDepartment();
    }
}