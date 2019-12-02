import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n,2);
        int max=0;
        do{
            max=(max<Integer.parseInt(s,2))?Integer.parseInt(s,2):max;
            s=rotate(s);
        }while(!s.equals(Integer.toString(n,2)));
        System.out.println(max);
    }
    public static String rotate(String s) {
        int i = 1 % s.length();
        return s.substring(i) + s.substring(0, i);
    }
}