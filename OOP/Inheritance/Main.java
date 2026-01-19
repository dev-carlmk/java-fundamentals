import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // //For Carl Class
        // String firstName = input.nextLine();
        // String lastName = input.nextLine();
        // int age = input.nextInt(); input.nextLine();
        // String status = input.nextLine();
        // String profession = input.nextLine();
        // Carl husband = new Carl (firstName, lastName, age, status, profession);
        // husband.coupleStatement();

        //For Sanpan Class
        Sanpan wife = new Sanpan(input.nextLine(), input.nextLine(), input.nextInt());
        wife.coupleStatement();
        //2 parameters?
        Sanpan wife2 = new Sanpan(input.nextLine(), input.nextLine());
        wife2.coupleStatement();
        
        input.close();
    }
}