public class hybrid {
    public static void main(String args[]){
        jay j1=new jay();
        j1.age=20;
        System.out.println(j1.age);
        j1.Stream="e&tc";
        System.out.println(j1.Stream);
        j1.gf=2;
        System.out.println(j1.gf);
        j1.room();

    }    
}
/*
 * vivek -> vaibhav -> vedang
 * vaibav -> shree
 * shree -> jay
 * jay -> niks
 * 
 */
 abstract class vivek{
    
    int age;
    String Stream;
    int gf;
    void room(){
      System.out.println("glamorous county");
    }
}

class vaibhav extends vivek{

}

class vedang extends vivek{

}

class shree extends vaibhav{

}

class jay extends shree {

}

class niks extends jay{

}
