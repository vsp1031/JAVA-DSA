public class static1 {
    public static void main(String args[]){
        vivek v1=new vivek();
        v1.name="vivek";
        v1.roll_no=76;
        v1.collage_name="NMIET";
        
        vivek v2=new vivek();
        
        v2.name="vaibhav";
        System.out.println(v2.name);
        v2.roll_no=70;
        System.out.println(v2.roll_no);
        System.out.println(v1.collage_name);
        


    }
}
class vivek{
    String name;
    int roll_no;
     static String collage_name;
      
     void setname(String args[]){
        this.name=name;
     }
        String getname(){
            return this.name;
    }
}


