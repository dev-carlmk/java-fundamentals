package OOP.ObjectComparison;
public class Main2 {
    public static void main(String[] args) {
        Student nicole = new Student("Nicole");
        Student carlos = new Student ("Carlos");
        Student tarpee = new Student ("Tarpee");

        // Output for Equality
        System.out.println(nicole.equals(carlos));

        // Output for Comparison 
        System.out.println(carlos.compareTo(tarpee)> 0);

        // Output for Conversion (String)
        System.out.println(nicole);
    }
    
}
