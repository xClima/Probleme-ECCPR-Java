import java.util.*;
public class Eccpr{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
    String x = sc.nextLine();
        for(int i=0;i<x.length()/2;i++){
            if((x.charAt(i)=='A'&&x.charAt(x.length()-i-1)!='T')
            ||(x.charAt(i)=='T'&&x.charAt(x.length()-i-1)!='A')
            ||(x.charAt(i)=='C'&&x.charAt(x.length()-i-1)!='G')
            ||(x.charAt(i)=='G'&&x.charAt(x.length()-i-1)!='C')){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(0);
    }
}