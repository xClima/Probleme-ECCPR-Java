import java.util.*;
public class ECCPR{
    public static void main(String []args){
        double n,m,nr,suma=0,cnt=0,y=0;
        Set<Double>s=new HashSet<Double>();
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            m=sc.nextInt();
            for(int j=0;j<m;j++){
                nr=sc.nextInt();
                s.add(nr);
                suma+=nr;
                if(nr>=100){
                    cnt++;
                }
            }
            if((cnt<(m-cnt))&&(suma<2900)&&(s.size()==6)&&(m>=8)&&(m<=20)){
                System.out.print(1+" ");
            }else {
                System.out.print(0+" ");
                y++;
            }
            cnt=0;
            suma=0;
            s.clear();
        }
        System.out.println();
        System.out.printf("%.2f",(y/n));
    }
}