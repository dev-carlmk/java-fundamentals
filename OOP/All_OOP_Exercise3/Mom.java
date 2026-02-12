package OOP.All_OOP_Exercise3;
public class Mom extends Parent{
    protected String favoriteDish; // Instance Variables

    // Child Class Constructor
    public Mom (String name, int age, String favoriteDish){
        super (name, age);
        this.favoriteDish = favoriteDish;
    }

    // Override work()
    @Override
    public void work(){
        System.out.println("Mom is working.");
    }
    
    // Overloading method cook()
    public String cook(){
        return "Mom is cooking";
    }
    public String cook(String dish){
        return "Mom is cooking " + dish;
    }

    // Override getInfo()
    @Override
    public String getInfo(){
        return "Mom's name: " + name + " | Age: " + age + " | Favorite Dish: " + favoriteDish;
    }

}