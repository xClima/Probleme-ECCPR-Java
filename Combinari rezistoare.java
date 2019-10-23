import java.util.*;
public class ECCPR{
    public static void main(String []args){
        long n,M;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        M=sc.nextInt();
        long k=0,a,c;
        int ok=0;
        
        while(k<=n){
            a=1;
            c=1;
            for(long i=(n-k+1);i<n+1;i++)
                a=a*i;
            for(long i=2;i<k+1;i++)
                c=c*i;

            if(a/c>=M){
                ok=1;
                break;
            }
            k++;
        }
        if(ok == 0)
            System.out.println(0);
        else
            System.out.println(k);
    }
        
}
