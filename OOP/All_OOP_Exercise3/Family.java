package OOP.All_OOP_Exercise3;
public class Family {
    private String familyName; // Instance Variable

    // Constructor
    public Family (String familyName){
        this.familyName = familyName;
    }

    // Private Inner Class
    private class Address{
        String city;
        public Address (String city){
            this.city = city;
        }
        public void showAddress(){
            System.out.println(" Address: " + city + " | Family's Name: " + familyName);
        }
    }
    public void displayAddress(){
        Address add = new Address("Monrovia, Liberia");
        add.showAddress();
    }

}
