public class Carl {

    protected String firstName; // When "protected", only classes under this same package will see these
    public String lastName; // When "public", all classes will see it
    private String profession;  // When "private", only the owner class will see it
    protected int age;
    protected String status;

    public Carl(String firstName, String lastName, int age, String status, String profession){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
        this.profession = profession;
    }

    public void coupleStatement(){
        System.out.println("Name: " + this.firstName + " " + this.lastName + "\nStatus: " + this.status + "\nAge: " + this.age + " years old\nProfession: " + this.profession);
    }
}
