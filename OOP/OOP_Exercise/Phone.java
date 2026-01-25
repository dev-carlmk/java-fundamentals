package OOP.OOP_Exercise;
public class Phone {
    protected static int count = 0; // Static Variable
    protected String brand; // Instance Variable
    protected String model;

    // Constructor (Parent Class)
    public Phone (String brand, String model){
        this.brand = brand;
        this.model = model;
        Phone.count += 1;
    }

    // Non-Void Method
    public String description(){
       return "Brand: " + brand + " | Model: " + model; 
       

    }

}
