package Basics;
public class Arrays {
    public static void main (String[] args){
        
        //Declaring Array Method 1
        String[] newArr = new String[5];
        newArr[0] = "Carlos";
        newArr[1] = "Mezee";
        newArr[2] = "Truth";
        newArr[3] = "Legend";
        newArr[4] = "Kerwillain";
        String x = newArr[2];
        System.out.println(x);

        //Declaring Array Method 2
        int[] numsArr = {1,2,3,4,5};
        int y = numsArr[1];
        System.out.println(y);
    }
    
}
