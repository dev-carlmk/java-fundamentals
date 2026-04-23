package OOP.Enums;
public class Main10{
public static void main (String[] args){
    Level lvl = Level.LOW;
    
    //getLvl() and setLvl() method
    lvl.setLvl(6);
    System.out.println(lvl.getLvl());

    Level[] arr = Level.values();
    String en = lvl.toString();

    for(Level e : arr){
        System.out.println(e);
    }

    System.out.println(Level.values());
    if(lvl == Level.LOW){
        System.out.println(lvl);
    }else if (lvl == Level.MEDIUM){
        System.out.println(lvl);
    }else{
        System.out.println(lvl);
    }
  }
}