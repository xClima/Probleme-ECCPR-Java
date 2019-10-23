import java.util.*;
public class ECCPR{
    public static void main(String []args){
        double nr,n;
        double suma=0,cnt=0,medie;
        Scanner sc= new Scanner(System.in);
        List<Double>list=new ArrayList<Double>();
        n=sc.nextInt();
        for(int i=0;i<n;i++) {
            nr = sc.nextDouble();
            list.add(nr);
        }
        for(int i=0;i<list.size();i++){
            if(i!=(list.size()-1)&&i!=0&&list.get(i)>list.get(i+1)&&list.get(i)>list.get(i-1)){
                suma+=list.get(i);
                cnt++;
            }
            if(i==0){
                if(list.get(i)>list.get(i+1)){
                    suma+=list.get(i);
                    cnt++;
                }
            }
            if(i==list.size()-1){
                if(list.get(i)>list.get(i-1)){
                    suma+=list.get(i);
                    cnt++;
                }
            }
        }
        medie=suma/cnt;
        cnt=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>medie){
                cnt++;
            }
        }
        System.out.printf("%.0f",cnt);
    }
}
