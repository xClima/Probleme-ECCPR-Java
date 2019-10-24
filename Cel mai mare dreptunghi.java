import java.util.*;
public class ECCPR{
    static int arie(int p11,int p12,int p21,int p22){
        return (p21-p11)*(p22-p12);
    }
    public static void main(String [] args){
        int p11,p12,p21,p22,max=0,p11o=0,p12o=0,p21o=0,p22o=0;
        String nume,out="";
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            nume=sc.next();
            p11=sc.nextInt();
            p12=sc.nextInt();
            p21=sc.nextInt();
            p22=sc.nextInt();
            if(arie(p11,p12,p21,p22)>max){
                max=arie(p11,p12,p21,p22);
                p11o=p11;
                p12o=p12;
                p21o=p21;
                p22o=p22;
                out=nume;
            }
        }
        System.out.print(out+" "+p11o+" "+p12o+" "+p21o+" "+p22o+" "+max);
        
    }
}