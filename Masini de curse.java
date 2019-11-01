import java.util.*;
public class ECCPR{
    public static void main(String [] args){
        double km,n,start,viteza,min=0;
        Set<Integer>out=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        km=sc.nextDouble();
        n=sc.nextDouble();
        for(int i=1;i<=n;i++){
            start=sc.nextDouble();
            viteza=sc.nextDouble();
            if (i==1) {
                min=(km-start)/viteza;
                out.add(i);
            }
            if((km-start)/viteza<min){
                min=(km-start)/viteza;
                out.clear();
                out.add(i);
            }
            if((km-start)/viteza==min){
                out.add(i);
            }
        }
        for(Integer i:out){
            System.out.print(i+" ");
        }
    }
}