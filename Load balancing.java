import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        if(m>n){
            while(cnt!=n){
                for(int i=cnt;i<m;i+=n){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                cnt++;
            }
        }else{
            for(int i=0;i<m;i++){
                System.out.println(arr[i]);
            }
        }
    }
}