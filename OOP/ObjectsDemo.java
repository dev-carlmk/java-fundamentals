package OOP;
import java.util.Scanner;
public class ObjectsDemo{
    public static void main(String[] args){
        
        //Object Examples
        Scanner sc = new Scanner(System.in);
        int x = 5;
        String str = "Objects";

        //Method Examples
        str.length();
        //sc.next(); 
        sc.close();
        legend("Function", 2);
        System.out.println(IntegerEx(6));
        System.out.println(StringEx("String Example with Function"));
    }

        //Function/Methods
    public static void legend (String str, int x){
        for(int i = 0; i < x; i++){
        System.out.println(str);
        }
    }

    public static int IntegerEx(int x){
        return x + 2;
    }

    public static String StringEx(String x){
        return x + " !";
    }
}