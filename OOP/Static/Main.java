package OOP.Static;

public class Main {
    public static void main (String[] args){
        Class kerwillain = new Class ("Kerwillain",24);
        Class foxx = new Class ("Foxx", 19);
        Class kiazolu = new Class ("Kiazolu", 55);
        
        // Static Variable (Count)
        System.out.println("There are " + Class.count + " classes created at the moment !");
        
        // Static Variable (Leg) | Speak Method Output
        kerwillain.speak();
        foxx.speak();
        kiazolu.speak();
        
        // Static Method Output
        Class.display();
    }
    
}
