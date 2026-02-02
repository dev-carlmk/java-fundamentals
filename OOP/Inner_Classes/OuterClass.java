package OOP.Inner_Classes;
public class OuterClass {
    
    // PRIVATE INNER CLASS
    // Inner Class is private (Only OuterClass can see and use it)
    private class InnerClass{
        public void display(){
            System.out.println("This is an inner class.");
        }
    }
    // Outer Class sets as a bridge for Main to see and use the private Inner Class 
    public void inner(){
        InnerClass in = new InnerClass();
        in.display();
    }


    // ------------------------------------------------------------------------------------------------------------

    
    // PUBLIC INNER CLASS
    // Inner Class is public (Main and OuterClass can see and use it)
    public class InnerClass1 {
        public void display(){
            System.out.println("This is an inner class.");
        }
    }
    // Outer Class can see and use the public inner class
    public void inner1(){
        InnerClass1 in = new InnerClass1();
        in.display();
    }
    // (OPTIONAL) Outer Class sees and is displaying the public inner class via Main Method
    /*public static void main(String[] args) {
        new OuterClass().inner1();
    }*/


    // ------------------------------------------------------------------------------------------------------------
    

    // INNER CLASS IN A METHOD
    public void inner2(){
        class InnerClass2{
            public void display1(){
                System.out.println("Inner Class in a Method");
            }
        }
        InnerClass2 in2 = new InnerClass2();
        in2.display1();
    }
    // (OPTIONAL) Outer Class sees and is displaying the public inner class via Main Method
    /*public static void main(String[] args) {
        new OuterClass().inner2();
    }*/

}
