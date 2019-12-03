import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []arr = new int [10];
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<n*m;i++){
            int nr=sc.nextInt();
            arr[nr]++;
        }
        double average=0;
        for(int i:arr){
            average+=i;
        }
        average/=10;
        double d=0;
        for(int i:arr){
            d+=Math.pow(i-average,2);
        }
        d/=10;
        d=Math.sqrt(d);
        n=0;
        for(int i:arr){
            if(i>=d){
                n++;
            }
        }
        System.out.println(n);
        
    }
}