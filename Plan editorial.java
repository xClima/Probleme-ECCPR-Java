import java.util.*;
public class ECCPR{
    static int numDigits(int number){
    int digits = 0;
    if (number < 0) digits = 1;
    while (number>0) {
        number /= 10;
        digits++;
    }
    return digits;
}
    public static void main(String [] args){
        int pag,prob,verif=0,out=0;
        Scanner sc= new Scanner(System.in);
        pag=sc.nextInt();
        prob=sc.nextInt();
        for(int i=pag;i>=1;i--){
            verif+=i;
        }
        if(verif<prob){
            System.out.print(0);
        }else{
            for(int i=1;i<=prob;i++){
                out+=numDigits(i);
            }
            System.out.print(out);
        }
    }
}