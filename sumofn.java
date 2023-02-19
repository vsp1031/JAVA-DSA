import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class sumofn {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum =0;
        while(a<10){
            System.out.println( a);
            System.out.println(sum);
            sum=sum+a;
            a++;
        }
     System.out.println(sum);
    }
}
