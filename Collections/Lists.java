package Collections;
import java.util.ArrayList;
public class Lists {
    public static void main (String[] args){
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(2);
        t.add (4);
        t.add(7);
        t.add(2);
        t.add (4);
        t.add(7);
        
        //Other Actions
        int g = t.get(0); //Get an index in the list
        t.set (2,6); //Change number by their index
        t.subList (1,4); //Get a portion of the list
        System.out.println(t);
        System.out.println(g);
    }
    
}
