package OOP.OOP_Exercise;

public class SmartPhone extends Phone {
    // New Variable
    private String OperatingSystem;

    // Constructor (Parent & Child)
    public SmartPhone (String brand, String model, String OperatingSystem){
        super (brand, model);
        this.OperatingSystem = OperatingSystem;
    }

    // Method Overriding
    @Override
    public String description(){
        return "Brand: " + this.brand + " | Model: " + this.model + " | " + this.OperatingSystem;
    }

}
