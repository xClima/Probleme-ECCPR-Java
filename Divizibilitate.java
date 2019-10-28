import java.util.*;
public class ECCPR{
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<Integer>();
        int n,nr,suma=0,out1=0,out2=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            nr=sc.nextInt();
            list.add(nr);
        }
        while(list.size()>0){
            for(int i=0;i<list.size();i++){
                suma+=list.get(i);
                if(suma%3==0&&(i+1)>out1&&suma>=3){
                    out1=i+1;
                    out2=suma;
                }
            }
            suma=0;
            list.remove(0);
        }
        System.out.print(out1+" "+out2);
    }
}