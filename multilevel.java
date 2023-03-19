public class multilevel {
    public static void main(String args[]){
        dog d1=new dog();
        d1.color="black";
        System.out.println(d1.color);
        d1.legs=4;
        System.out.println(d1.legs);
        d1.eat();
        d1.breadth();

    }
    
}

//    BASE CLASS
class Animals{
int legs;
void eat(){
    System.out.println("EATS");
}
void breadth(){
    System.out.println("BREADTS");
}
String color;
}

//     DERIVED CLASS 2
class mammels extends Animals{
    int legs;
    String color;
}

//      DERIVED CLASS 1
class dog extends mammels{
    int legs;
    String color;
}

