import java.util.*;
public class ECCPR{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,nr;
        TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
        n=sc.nextInt();
        for(int i=1;i<=6;i++){
            map.put(i,0);
        }
        for(int i=0;i<n;i++){
            nr=sc.nextInt();
            map.put(nr,map.get(nr)+1);
            //System.out.println(map.values().toArray()[nr-1]+" "+map.keySet().toArray()[nr-1]);
        }
        Integer max=(Integer)map.values().toArray()[0];
        Integer min=(Integer)map.values().toArray()[0];
        for(int i=0;i<map.size();i++){
            if((Integer)map.values().toArray()[i]<min){
                min=(Integer)map.values().toArray()[i];
            }
            if((Integer)map.values().toArray()[i]>max){
                max=(Integer)map.values().toArray()[i];
            }
        }
        if(max-min>0.1*n){
            System.out.print(1);
        }else System.out.print(0);
    }
}