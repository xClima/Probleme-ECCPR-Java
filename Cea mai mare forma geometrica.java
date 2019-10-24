import java.util.*;
public class ECCPR{
    static float arie(float x){
        return x*x;
    }
    static double arie(double x, double y){
        return x*y;
    }
    static double arie(double x){
        return 3.1415*x*x;
    }
    public static void main(String[]args){
        double x,y;
        double max=0,nrout=0,nrout2=0;
        String in,out="";
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            in=sc.next();
            if(in.equals("patrat")){
                x=sc.nextDouble();
                if(arie((float)x)>max){
                    max=arie((float)x);
                    nrout=x;
                    out="patrat";
                }
            }
            if(in.equals("dreptunghi")){
                x=sc.nextDouble();
                y=sc.nextDouble();
                if(arie(x,y)>max){
                    max=arie(x);
                    nrout=x;
                    nrout2=y;
                    out="dreptunghi";
                }
            }
            if(in.equals("cerc")){
                x=sc.nextDouble();
                if(arie(x)>max){
                    max=arie(x);
                    nrout=x;
                    out="cerc";
                }
            }
        }
        System.out.print(out+" ");
        if(!out.equals("dreptunghi")){
            System.out.printf("%.2f",nrout);
        }else {
            System.out.printf("%.2f",nrout);
            System.out.printf(" %.2f",nrout2);
        }
    }
}