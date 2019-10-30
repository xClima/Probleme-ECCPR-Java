public class Triunghi{
    double a,b,c,raport;
    Triunghi(double a, double b, double c){
        if((Math.max(Math.max(a,b),c)<(a+b+c)-Math.max(Math.max(a,b),c))&&(a!=b)&&(b!=c)&&Math.pow(Math.max(Math.max(a,b),c),2)!=Math.pow((a+b+c)-Math.max(Math.max(a,b),c)-Math.min(Math.min(a,b),c),2)+Math.pow(Math.min(Math.min(a,b),c),2)){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
    void setRaport(){
        double arie=Math.sqrt(((this.a+this.b+this.c)/2)*(((this.a+this.b+this.c)/2)-this.a)*(((this.a+this.b+this.c)/2)-this.b)*(((this.a+this.b+this.c)/2)-this.c));
        double perimetru=this.a+this.b+this.c;
        this.raport=arie/perimetru;
    }
}

import java.util.*;
public class ECCPR{
    public static void main(String []args){
        double max=0;
        int index=0;
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            Triunghi tr= new Triunghi(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            tr.setRaport();
            max=(tr.raport>max)?tr.raport:max;
            index=(tr.raport>=max)?i:index;
        }
        System.out.printf("%d %.3f",(int)index,max);
    }
}