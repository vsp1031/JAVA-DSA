
public class herirachal {
    public static void main(String arg[]){
    birds parrot=new birds();
    parrot.color="lighrt green";
    System.out.println(parrot.color);
    parrot.legs=2;
    System.out.println(parrot.legs);
    parrot.vegetian="veg";
    System.out.println(parrot.vegetian);
    parrot.eat();
    parrot.breadth();
    }
}
class Animals{
    String color;
    int legs;
    String vegetian;
    void eat(){
        System.out.println("EATS ");
    }
    void breadth(){
        System.out.println(" BREADTHS");
    }
}
class birds extends Animals{

}
class mammels extends Animals{

}
class wild_animals extends Animals{

}

