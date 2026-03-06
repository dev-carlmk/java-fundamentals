package OOP.Interface;
public interface Vehicle {
    
    final int gears = 5;

    void changeGear(int a);
    void speedUp(int a);
    void slowDowm (int a);

    default void out(){
        System.out.println("Default Method");
    }
    static int math(int b){
        return b+9;
    }

}
