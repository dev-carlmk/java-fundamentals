package Collections;
import java.util.Set;
import java.util.HashSet;

public class Sets {
    public static void main (String[] args){
        
        //HashSet are unordered
        Set<Integer> t = new HashSet<Integer>();
        t.add(5); //To add element
        t.add(7);
        t.add(9);
        t.add(5); //Not include because it's repeated
        t.add(3);
        
        //Other Actions
        t.remove(3); //To remove element
        int s = t.size(); //Check the size of the set
        boolean c = t.contains(7); //Check if element exists in a set
        boolean e = t.isEmpty(); //Check whether the set is empty
        t.clear(); //To clear the set

        System.out.println(e);
        System.out.println(s);
        System.out.println(c);
    }
}
