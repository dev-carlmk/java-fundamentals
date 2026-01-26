public class Device {
    protected String brand; // Instance Variables
    protected int year;

    // Constructor (Parent Class)
    public Device (String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    // Non-Void Method
    public String getInfo(){
        return "Brand: " + brand + " | Year: " + year; 
    }

}
