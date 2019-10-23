import java.util.*;
public class ECCPR{
    public static void main(String [] args){
        long k,M,rez;
        Scanner sc=new Scanner(System.in);
        k=sc.nextLong();
        M=sc.nextLong();
        long n=k,ok=0;
        do{
            rez=1;
            for(long i=(n-k+1);i<(n+1);i++)
                rez=rez*i;
            
            if(rez<=M)
                ok=1;
            n++;
            if(rez>M)
                break;
        }while(true);
    if(ok==0)
        System.out.print(0);
    else
        System.out.print(n-2);
    }
}