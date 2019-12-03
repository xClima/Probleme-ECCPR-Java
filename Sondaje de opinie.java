import java.util.*;
public class ECCPR{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),inceput=0,sfarsit=0,max=0,aux=0,cnt=1;
        boolean verif=true;
        String s,x="",out="";
        for(int i=0;i<n;i++){
            s=sc.next();
            aux=sc.nextInt();
            for(int j=1;j<m;j++){
                if(j==1) inceput=aux;
                sfarsit=sc.nextInt();
                if(aux<=sfarsit){
                    cnt++;
                }
                aux=sfarsit;
            }
            if(cnt==m){
                x+=s+" ";
            }
            cnt=1;
            if(sfarsit-inceput>max){
                max=sfarsit-inceput;
                out=s;
            }
        }
        if(x!=""){
            System.out.println(x);
        }else System.out.println("Nu exista");
        
        System.out.print(out+" "+max+"%");
    }
}