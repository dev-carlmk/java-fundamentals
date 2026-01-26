public class Laptop extends Device {
    private boolean hasTouchScreen; // Instance Variable

    // Constructor (Parent & Child Class)
    public Laptop(String brand, int year, boolean hasTouchScreen){
        super (brand, year);
        this.hasTouchScreen = hasTouchScreen;
    }

    // Method Overriding
    @Override
    public String getInfo(){
        return super.getInfo() + " | Touch Screen?: " + (hasTouchScreen ? "Yes" : "No");
    }

}
