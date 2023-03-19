public class polymorp {
    public static void main(String args[]){
        Animals a1=new Animals();
        a1.eat();


    }
}
/*
 * POLYMORPHISM:
 *              METHOD/FUNCTION OVERLOADING 
 *              METHOD/FUNCTION OVERRIDING
 */

class Animals{
    void eat(){
        System.out.println("eats");
    }
}
class Birds{
    void eat(){
        System.out.println("eats");
    }
}
