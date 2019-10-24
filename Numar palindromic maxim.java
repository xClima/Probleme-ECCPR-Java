import java.util.*;
public class ECCPR{
    public static void main(String []args){
        int n,nr,center=0,ok=0;
        TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=9;i++){
            map.put(i,0);
        }
        for(int i=0;i<n;i++){
            nr=sc.nextInt();
            map.put(nr,map.get(nr)+1);
        }
        int x=0;
        for(int i=map.size()-1;i>=0;i--){
            if(map.get(i)==1||map.get(i)%2==1){
                center=i;
                ok++;
                map.put(i,map.get(i)-1);
            }
            if(ok>1){
                System.out.print(0);
                return;
            }
            x=map.get(i)/2;
            while(map.get(i)!=x){
                arr.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
        if(ok==1){
            System.out.print(center);
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i));
        }
    }
}