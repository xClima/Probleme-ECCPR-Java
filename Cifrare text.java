import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0,aux=0;
        while(cnt!=s.length()){
            while(aux!=n){
                if(cnt==s.length()) break;
                if(!(Character.isLetter(s.charAt(cnt)))){
                    System.out.print(s.charAt(cnt));
                }else{
                    if((((int)(s.charAt(cnt))+arr[aux]<=(int)'z')&&((int)(s.charAt(cnt))+arr[aux]>=(int)'a'))||
                    (((int)(s.charAt(cnt))+arr[aux]<=(int)'Z')&&((int)(s.charAt(cnt))+arr[aux]>=(int)'A'))){
                        System.out.print((char)((int)(s.charAt(cnt))+arr[aux]));
                    }else System.out.print((char)((int)(s.charAt(cnt))+arr[aux]-26));
                aux++;
                } 
                cnt++;
            }
            aux=0;
        }
    }
}