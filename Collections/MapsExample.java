package Collections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapsExample{
    public static void main (String[] args){
        Map<Character, Integer> m = new HashMap<>();
        
        //Map Example
        String str = "Hello, I'm Dev-Legend and I'm backend focused";
        for (char x:str.toCharArray()){
            if(m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x, old + 1);
            }else{
                m.put(x,1);
            }
        }
        //m.remove(' ');
        System.out.println(m);

        
        //Sorting
        int[] x = {-99,9,8,7,6,5,4,3,2,1,0};
        Arrays.sort(x, 1,6); 

        for(int i:x){
            System.out.print(i + ",");
        }
    }

}