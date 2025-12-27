package Basics;
public class BasicOperations {
    public static void main (String[] args){
        //Addition
        int x = 5;
        int y = 7;
        int z = 57;
        int sum;
        sum = x + y + z;
        System.out.println(sum);

        //Division
        double a = 7;
        double b = 57;
        double quo;
        quo = b / a;
        System.out.println(quo);

        //Remainers
        int rem = z % y;
        System.out.println(rem);

        //Exponent
        double exp = Math.pow(a,b);
        System.out.println(exp);

    }
}
