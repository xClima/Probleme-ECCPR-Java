import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m=0,s=0;
        ArrayList<Double>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextDouble());
            m+=list.get(i);
        }
        m/=n;
        for(double i:list){
            s+=Math.pow(i-m,2);
        }
        s/=n;
        s=Math.sqrt(s);
        double cnt=0;
        for(double i:list){
            if(i>=m-s&&i<=m+s){
                cnt++;
            }
        }
        System.out.printf("%.2f",(cnt/list.size())*100); 
    }
}