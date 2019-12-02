import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        double uu=0,uz=0,zu=0,zz=0,u=0,z=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)=='0'&&s.charAt(i+1)=='0'){
                zz++;
                z+=2;
            }else
            if(s.charAt(i)=='0'&&s.charAt(i+1)=='1'){
                zu++;
                z++;
                u++;
            }else
            if(s.charAt(i)=='1'&&s.charAt(i+1)=='0'){
                uz++;
                z++;
                u++;
            }else
            if(s.charAt(i)=='1'&&s.charAt(i+1)=='1'){
                uu++;
                u+=2;
            }
        }
        System.out.printf("%.2f %.2f\n",Math.max(Math.max(zu,uu),Math.max(uz,zz))/Math.min(Math.min(zu,uu),Math.min(uz,zz)),Math.max(u,z)/Math.min(u,z));
        if(Math.max(u,z)/Math.min(u,z)>=1.1||Math.max(Math.max(zu,uu),Math.max(uz,zz))/Math.min(Math.min(zu,uu),Math.min(uz,zz))>=1.1){
            System.out.print(0);
        }else System.out.print(1);
    }
}