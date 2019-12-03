import java.util.*;
public class Eccpr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int cnt=0;
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<n*m;i++){
            cnt++;
            s.add(sc.nextInt());
        }
        System.out.print(cnt-s.size()*2);
    }
}