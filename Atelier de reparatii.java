import java.util.*;
public class ECCPR{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int [] arr= new int[7];
        for(int i=0;i<7;i++){
                arr[i]+=sc.nextInt();
            }
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            for(int i=0;i<7;i++){
                arr[i]+=sc.nextInt();
            }
        }
        int min=arr[0];
        for(int i=0;i<7;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        if(min>n) System.out.print(n);
        else System.out.print(min);
    }
}