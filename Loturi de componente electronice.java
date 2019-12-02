import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int R=0,C=0,T=0;
        int max=0,util=0;
        for(int i=0;i<n;i++){
            int nr=sc.nextInt();
            max=(nr>max)?nr:max;
            for(int j=0;j<nr;j++){
                String s=sc.next();
                R=(s.equals("R"))?R+1:R;
                C=(s.equals("C"))?C+1:C;
                T=(s.equals("T"))?T+1:T;
            }
            if(R>0&&C>0&&T>0&&R>=C&&C>=T){
                util++;
            }
            R=0;C=0;T=0;
        }
        System.out.println(util + " " + max);
    }
}