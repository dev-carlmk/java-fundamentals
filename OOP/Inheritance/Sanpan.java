public class Sanpan extends Carl {

    //Child Class Constructor
    public Sanpan (String girlfirstName, String lastName, int age, String status){
        super ("Carl", lastName, age, "married",""); //Parent Class Constructor
        this.firstName = girlfirstName;
    }

    //3 parameters?
    public Sanpan (String girlfirstName, String lastName, int age){
        super ("Carl", lastName, age, "married", ""); //Parent Class Constructor
         this.firstName = girlfirstName;
    }

    //2 parameters?
    public Sanpan (String girlfirstName, String lastName){
        super ("Carl", lastName, 0, "married",""); //Parent Class Constructor
        this.firstName = girlfirstName;
    }
    //Overwriting CoupleStatement Method (Child Class)
    public void coupleStatement(){
         System.out.println("Name: " + this.firstName + " " + this.lastName + "\nAge: " + this.age + " years old\nHappily " + super.status + " to " + super.firstName + " " + super.lastName);
    }


}
