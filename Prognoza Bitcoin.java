import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Double>list = new ArrayList<>();
        double medie=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextDouble());
        }
        double max=0,min=0;
        for(int i=0;i<m;i++){
            for(Double e:list) medie+=e;
            medie/=list.size();
            min=(i==0)?medie:((min>medie)?medie:min);
            max=(medie>max)?medie:max;
            list.add(medie);
            medie=0;
            list.remove(0);
            System.out.printf("%.2f ",list.get(list.size()-1));
        }
        System.out.printf("\n%.2f %.2f",max,min);
    }
}