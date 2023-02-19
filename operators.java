public class operators {
    public static void main(String args[]){

        int a =10;
        int b =30;

    //-------------------ARATHMATIC OPERATOR--------------------------------
    //BINARY
    //UNIRAY - PRE INCERMENT    
    //       -  POST INCREMENT

    System.out.println("___________ARITHMATIC  OPERTOR__________________");

        int sum=a+b;
        System.out.println("ADDITION OF A AND B IS = "+ sum);
        //
        int sub=a-b;
        System.out.println("SUBTRACTION  OF A AND B IS = "+ sub);
        int div=a/b;
        System.out.println("DIVISIN  OF A AND B IS = "+ div);
        int modulus=a%b;
        System.out.println("MODULUS  OF A AND B IS = "+  modulus);
        //
        int mul =a*b;
        System.out.println("MULTIPLICATION OF A AND B IS = "+mul);

    //-------------------LOGICAL OPERATOR--------------------------------
    System.out.println("___________LOGICAL OPERTOR__________________");
    //int AND
    System.out.println( (a>b) && (a<b));
    //int OR
    System.out.println( (a>b) || (a<b));
    //int NOT
    System.out.println( (a>b) |! (a<b));



    // //-------------------BITWISE OPERATOR--------------------------------
    System.out.println("___________BITWISE OPERTOR__________________");


        int and=a&b;
        System.out.println("ADDITION OF A AND B IS = "+ and);
        //
        int or=a|b;
        System.out.println("SUBTRACTION  OF A AND B IS = "+ or);
       

   
    // //-------------------ASSIGNMENT OPERATOR--------------------------------
    System.out.println("___________ASSIGNMEN OPERTOR__________________");

    System.out.println(a=b);
    System.out.println(a+=5);
    System.out.println(a-=b);
    System.out.println(a/=b);
    System.out.println(a*=b);
   


    //-------------------RELATIONAL OPERATOR-------------------------------- 
    System.out.println("___________RELATIONAL OPERTOR__________________");

    System.out.println(a==b);
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a!=b);
    System.out.println(a>=b);
    System.out.println(a<=b);

    }
    
}
