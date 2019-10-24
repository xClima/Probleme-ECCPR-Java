import java.util.*;
public class ECCPR{
    public static void main(String []args){
        int k,n,nr;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<k*k;i++){
            nr=sc.nextInt();
            list.add(nr);
        }
        for(int i=0;i<n;i++){
            nr=sc.nextInt();
            for(int j=0;j<list.size();){
                if(list.get(j)==nr){
                    list.remove(j);
                }else j++;
            }
        }
        int suma=0;
        if(list.size()==0){
            System.out.print("BINGO!");
        }else{
            System.out.print(list.size());
        } 
    }
}