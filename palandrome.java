import javax.swing.plaf.synth.SynthOptionPaneUI;

public class palandrome {
    public static void main(String args[]){
        int number=12321;
        ispalandrome(number);
    }
    public static boolean ispalandrome(int number){
        int palandrome= number;
        int reverse=0;
        while(palandrome!=0){
            int reminder=palandrome%10;
            reverse=reverse*10+reminder;
            palandrome=palandrome/10;
        }
        if(number==reverse){
            return true;
        }
           return false;
        
    }
    
}
