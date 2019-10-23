import java.util.*;
public class ECCPR{
    public static void main(String []args){
        double n,nr;
        Scanner sc=new Scanner(System.in);
        ArrayList<Double>list=new ArrayList<Double>();
        double medie,suma=0,valori=0,cnt;
        while(sc.hasNext()!=false) {
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                nr=sc.nextInt();
                list.add(nr);
            }
        }
        for(int i=0;i<list.size();i++){
            cnt=0;
            for(int j=0;j<list.size();j++){
                if(list.get(i)>=list.get(j))
                    cnt++;
            }
            if(cnt>=6){
                suma+=list.get(i);
                valori++;
            }
        }
        medie=suma/valori;
        System.out.printf("%2f /n",medie);

    }

}