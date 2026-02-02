package OOP.Inner_Classes;
public class Main3 {
    public static void main(String[] args) {
    
    // Main Class can now see and use the private Inner Class via Outer Class   
    OuterClass out = new OuterClass();
    out.inner();

    // Main Class sees and is using the public inner class
    OuterClass out1 = new OuterClass();
    out1.inner1();

    // Main Class sees and is using the public inner class in "inner2()" method
    OuterClass out2 = new OuterClass();
    out2.inner2();
  }
}
