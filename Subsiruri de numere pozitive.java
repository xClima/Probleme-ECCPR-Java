import java.util.*;
public class ECCPR{
    public static void main(String[]x){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index=0,cnt=0,max=0;
        String nr;
        for(int i=0;i<n;i++){
            nr=sc.next();
            if(nr.charAt(0)!='-'){
                cnt++;
            }else{
                cnt=0;
            }
            if(cnt>max){
                max=cnt;
                index=i;
            }
        }
        if(max>0){
            System.out.print((index-max+1)+" "+max);
        }else System.out.print(-1+" "+max);
    }
}