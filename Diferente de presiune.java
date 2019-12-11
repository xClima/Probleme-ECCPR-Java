import java.util.*;
public class Eccpr{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        double min=0,max=0;
        int n = sc.nextInt();
        int z = sc.nextInt();
        List<Double>list = new ArrayList<>();
        for(int i=0;i<n;i++) list.add(sc.nextDouble());
        for(int i=0;i<z;i++){
            double suma=0;
            for(Double e:list)suma+=e;
            min=(i==0)?suma/list.size():((suma/list.size()<min)?suma/list.size():min);
            max=(suma/list.size()>max)?suma/list.size():max;
            System.out.printf("%.2f ",suma/list.size());
            list.add(suma/list.size());
            list.remove(0);
        }
        System.out.printf("\n%.2f",max-min);
    }
}