import java.util.*;
public class ECCPR{
    public static void main(String []args){
        int nr,n,m,cnt=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0;i<n*m;i++){
            nr=sc.nextInt();
            for(int j=2;j<=nr/2;j++){
                if(nr%j==0){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
        }
    }