import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        ArrayList<Integer>out=new ArrayList<>();
        int cnt=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(cnt>max){
                    max=cnt;
                }
                cnt=0;
            }else{
                cnt++;
            }
        }
        if(cnt>max){
            max=cnt;
        }
        for(int i=0;i<max;i++){
            out.add(0);
        }
        cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(cnt!=0){
                    n=out.get(cnt-1)+1;
                    out.set(cnt-1,n);
                }
                cnt=0;
            }else{
                cnt++;
            }
        }
        if(cnt!=0){
                    n=out.get(cnt-1)+1;
                    out.set(cnt-1,n);
                }
        max=1;
        System.out.print(out.get(0)+" ");
        cnt=out.get(0);
        for(int i=1;i<out.size();i++){
            System.out.print(out.get(i)+" ");
            if(out.get(i)>cnt){
                max=0;
            }else cnt=out.get(i);
        }
        System.out.println();
        System.out.println(max);
    }
}