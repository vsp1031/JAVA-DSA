
public class object {
    public static void main(String args[]){
        vivek v1= new vivek();
        v1.setfname("vivek  ");
        System.out.print(v1.fname);
        v1.setlname("pawar  ");
        System.out.println(v1.lname);
        v1.setage(20);
        System.out.println(v1.age);

        //ACCESS MODIFIERS 
        // PRIVATE ,PUBLIC 
        bankdetails   b1=new bankdetails();
        b1.username="vivek";

        // [[  HERE TH E= PASSWORD IS NOT VISIBLE BEACAUSE IT IS IN THE 
        // PRIVATE ACCESS MODIFIERS  ]]
       // b1.password=7845697852;
       

    }
    
}
class vivek{
    String fname;
    String lname;
    int age;
    void setfname(String newfname){
        fname=newfname;
    }
    void setlname(String newlname){
        lname=newlname;
    }
    void setage(int setage){
        age=setage;
    }

}
class bankdetails{
    public String username;
    private int password;
    public void setpassword(String password){
        setpassword(password);
    }
}
