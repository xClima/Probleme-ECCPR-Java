import java.util.*;
public class ECCPR{
    public static void main(String[]args){
        int n,nr,sum=0;
        Set<Integer>s=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        while(sc.hasNext()){
            nr=sc.nextInt();
            s.add(nr);
        }
        System.out.print(sum-s.stream().mapToInt(Integer::intValue).sum());
    }
}