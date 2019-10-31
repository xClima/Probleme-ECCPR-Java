import java.util.*;
public class ECCPR{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }sc.close();
        int suma=list.get(0),cnt=0;
        boolean verif=true;
        ArrayList<Integer>out=new ArrayList<>();
        for(int i=1;i<list.size();i++){
            if(list.get(i)>suma){
                suma+=list.get(i);
            }else{
                out.add(i+1);
                cnt++;
                verif=(i>=n/2+n%2)?false:true;
                list.set(i,suma+1);
                suma+=list.get(i);
            }
        }
        if(verif==true&&cnt<=2){
            System.out.println(cnt);
            for(int i=0;i<out.size();i++){
                System.out.println(out.get(i));
            }System.out.println("ACCEPT");
        }else{
            System.out.println(cnt);
            for(int i=0;i<out.size();i++){
                System.out.println(out.get(i));
            }System.out.println("RESPINS");
        }
    }
}