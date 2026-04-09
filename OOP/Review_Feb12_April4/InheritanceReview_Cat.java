//Inheritance allows a subclass (child) to acquire the properties/behaviors of a superclass (parent)
package OOP.Review_Feb12_April4;
public class InheritanceReview_Cat extends ClassReview_Dog{
    protected int food;

    public InheritanceReview_Cat(String name, int age, int food){
        super(name,age);
        this.food = food;
    }

    @Override // Overwriting speak() method
    public void speak(){
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old. I was fed " + this.food + " packs of milk today.");
    }
}