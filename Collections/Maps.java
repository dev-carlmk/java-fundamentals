package Collections;
import java.util.Map;
import java.util.HashMap;
public class Maps{
    public static void main (String[] args){
        Map<String, Integer> m = new HashMap<>();
        m.put("Carlos", 20);
        m.put("John", 22);
        m.put("Anna", 19);

        //Other Actions
        m.values(); //Display all values in a map
        //m.clear(); //Empty the map
        boolean ck = m.isEmpty(); //Check whether the map is empty
        m.containsValue(20); //Check if value exists in a map
        m.containsKey("Carlos"); //Check if key exists in a map


        System.out.println(ck);
    }
}