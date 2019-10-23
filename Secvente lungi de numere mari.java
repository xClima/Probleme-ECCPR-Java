import java.util.*;
public class ECCPR{
    public static void main(String []args){
        double nr,prag;
        int n;
        Scanner sc=new Scanner(System.in);
        List<Double>list=new ArrayList<Double>();
        n=sc.nextInt();
        int cnt=0,aux=0;
        for(int i=0;i<n;i++){
            nr=sc.nextDouble();
            list.add(nr);
        }
        prag=sc.nextDouble();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>prag){
                list.set(i,(double)1);
                aux++;
            }else{
                list.set(i,(double)0);
                if(aux>0) {
                    cnt++;
                    aux = 0;
                }
            }
        }
        if(aux>0){
            cnt+=1;
        }
        System.out.println(cnt);
    }
}
