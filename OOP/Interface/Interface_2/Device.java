package OOP.Interface.Interface_2;
public class Device implements Phone{

    private double update = 1.0;
    private int phone = 14; 
    
    public void changeVersion(double update){
        this.update = update;
    }

    public void upgradePhone(int upgrade1){
        this.phone += upgrade1;
    }

    public void downgradePhone(int upgrade1){
        this.phone -= upgrade1;
    }

    public void display1(){
        System.out.println("Carlos has iPhone 14 which he update to iOS " + this.update + " but later downgrade to iPhone " + this.phone + ". He wishes for iPhone " + this.phone);
    }
}