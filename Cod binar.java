import java.util.*;
import java.lang.Math;
public class ECCPR{
    public static void main(String []args){
        int n,nr;
        int zero=8,unu=0,max=0;
        String aux;
        ArrayList<Integer>list=new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            nr=sc.nextInt();
            aux=Integer.toBinaryString(nr);
            for(int j=0;j<aux.length();j++){
                if(aux.charAt(j)=='1'){
                    unu++;
                }
            }
            zero=8-unu;
            if(zero>max){
                max=zero;
                list.clear();
                list.add(nr);
            }else if(zero==max){
                list.add(nr);
            }
            unu=0;
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}