import java.util.*;
public class ECCPR{
    public static void main(String []args){
        int n,m,b;
        double medie=0;
        String nume;
        int nr;
        boolean ok=true;
        Scanner sc=new Scanner(System.in);
        TreeMap<Double,String>list=new TreeMap<Double,String>();
        n=sc.nextInt();
        m=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            nume=sc.nextLine();
            for(int j=0;j<m;j++){
                nr=sc.nextInt();
                if(nr>=5){
                    medie+=nr;
                }else ok=false;
            }
                    
            if(ok==true&&medie/m>=8){
                list.put(medie/m,nume);
            }
            sc.nextLine();
            ok=true;
            medie=0;
        }
        if(list.size()>b){
            System.out.println(b);
            System.out.print(list.values().toArray()[list.size()-1]+" ");
            System.out.printf("%.2f",list.keySet().toArray()[list.size()-1]);
        }else{
            System.out.println(list.size()-1);
            System.out.print(list.values().toArray()[list.size()-1]+" ");
            System.out.printf("%.2f",list.keySet().toArray()[list.size()-1]);
        }
    }
}