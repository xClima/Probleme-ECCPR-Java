import java.util.*;
public class ECCPR{
    public static void main(String []args){
        int lim,n,nr,pag;
        Scanner sc= new Scanner(System.in);
        lim=sc.nextInt();
        n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            nr=sc.nextInt();
            pag=sc.nextInt();
            for(int j=0;j<nr;j++){
                list.add(pag);
            }
        }
        int suma=0;
        while(list.size()>0){
            for(int i=0;i<list.size();){
                if(list.get(i)+suma<=lim){
                    suma+=list.get(i);
                    System.out.print(list.get(i)+" ");
                    list.remove(i);
                }else i++;
            }
            System.out.println();
            suma=0;
        }
    }
}