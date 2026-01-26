public class Main1 {
    public static void main(String[] args) {
        
        //Create Objects
        Device phone = new Device ("SamSung", 2001);
        Laptop windows11 = new Laptop ("HP",2024,false);

        //Call Methods
        String display = phone.getInfo();
        System.out.println(display);

        String display2 = windows11.getInfo();
        System.out.println(display2);
    }
}
