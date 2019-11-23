public class Registre{
    int adresa;
    int valoare;
    Registre(int adresa, int valoare){
        this.adresa=adresa;
        this.valoare=valoare;
    }

}
import java.util.*;
public class ECCPR{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Registre>list=new ArrayList<>();
        int n=sc.nextInt();
        int x,y,z;
        int a1=0,a2=0,ver=0,a3=0;
        String comanda;
        for(int i=0;i<n;i++){
            comanda=sc.next();
            if(comanda.equals("lconst")){
                x=sc.nextInt();
                y=sc.nextInt();
                for(int j=0;j<list.size();j++){
                    if(list.get(j).adresa==x){
                        ver=1;
                        list.get(j).valoare=y;
                    }
                }
                if(ver==0){
                    list.add(new Registre(x,y));
                }ver=0;
            }
            else if(comanda.equals("print")){
                x=sc.nextInt();
                for(int j=0;j<list.size();j++){
                    if(list.get(j).adresa==x){
                        System.out.println(list.get(j).valoare);
                    }
                }
            }
            else{
                x=sc.nextInt();
                y=sc.nextInt();
                z=sc.nextInt();
                for(int j=0;j<list.size();j++){
                    if(list.get(j).adresa==y){
                        a1=list.get(j).valoare;
                    }
                    if(list.get(j).adresa==z){
                        a2=list.get(j).valoare;
                    }
                    if(list.get(j).adresa==x){
                        a3=j;
                        ver=1;
                    }
                }
                if(comanda.equals("add")){
                    if(ver==1){
                        list.get(a3).valoare=a1+a2;
                    }else{
                        list.add(new Registre(x,a1+a2));
                    }
                }
                if(comanda.equals("mul")){
                    if(ver==1){
                        list.get(a3).valoare=a1*a2;
                    }else{
                        list.add(new Registre(x,a1*a2));
                    }
                }
                if(comanda.equals("div")){
                    if(a2!=0){
                        if(ver==1){
                            list.get(a3).valoare=a1/a2;
                        }else{
                            list.add(new Registre(x,a1/a2));
                        }
                    }else{
                        System.out.println("Exception: line "+(i+1));
                    }   
                }
                ver=0;
            }
        }
    }
}