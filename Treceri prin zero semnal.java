import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double medie=0;int cnt=0;
        double []arr=new double [n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            arr[i]=Double.parseDouble(s);
        }
        int w=sc.nextInt();
        for(int i=0;i<arr.length;i+=w){
            for(int j=i;j<i+w&&j<arr.length;j++){
                medie+=arr[j];
                cnt++;
            }
            medie/=cnt;
            cnt=0;
            for(int j=i;j<i+w&&j<arr.length;j++){
                arr[j]-=medie;
            }
            medie=0;
            for(int j=i;j<i+w-1&&j<arr.length-1;j++){
                cnt=((arr[j]>=0&&arr[j+1]<0)||(arr[j]<0&&arr[j+1]>=0))?cnt+1:cnt;
            }
            System.out.println(cnt);
            cnt=0;
        }
    }
}