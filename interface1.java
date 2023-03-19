public class interface1 {
    public static void main (String args[]){
        comp c1=new comp();
        c1.sub();

    }
    
}
interface NMIET{
    void sub();
}
class comp implements NMIET{
    public void sub(){
        System.out.println("M3, DBMS,NETWORKING,MICROPROCESSOR");
    }
}
class entc  implements NMIET{
    public void sub(){
        System.out.println("M3, DBMS,NETWORKING,MICROPROCESSOR");
    }
}
class it implements NMIET{
    public void sub(){
        System.out.println("M3, DBMS,NETWORKING,MICROPROCESSOR");
    }
}
