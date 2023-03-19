
public class single {
    public static void main(String args[]){
         
        vivek v1=new vivek();
        v1.roll_no=76;
        
        System.out.println(v1.roll_no);
        v1.sub1();
        v1.sub2();
        raj r1=new raj();

        r1.roll_no=77;
        System.out.println(r1.roll_no);
        r1.sub1();
        r1.sub2();
    }
    
}
class vivek{
   int roll_no;
    void sub1(){
        System.out.println("ENGLISH");
    };
    void sub2(){
        System.out.println("MATHS");
    };
    
}
class raj extends vivek{
    int roll_no;
}
