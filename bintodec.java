import java.rmi.server.RemoteStub;

import javax.print.attribute.standard.RequestingUserName;

public class bintodec {
    public static void main(String args[]){
        int n=1010;
        bintodec(n);

    }
    public static void bintodec(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int ld=n%10;
                dec=dec+(ld*((int)Math.pow(2, pow)));
                pow++;
                n =n/10;

        }
        System.out.println(dec);
    }
    
    
}
