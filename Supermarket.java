//este o clasa separata trebuie creata clasa Produs.java
public class Produs{
    String cod;
    Character tip;
    double pret;
    Produs(String cod, Character tip, double pret){
        this.cod=cod;
        this.tip=tip;
        this.pret=pret;
    }
}
import java.util.*;
public class ECCPR{
    public static void main(String []args){
        int a,b;
        String cod;
        Character tip;
        double pret;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        ArrayList<Produs>list=new ArrayList<Produs>();
        for(int i=0;i<a;i++){
            cod=sc.next();
            tip=sc.next().charAt(0);
            pret=sc.nextDouble();
            list.add(new Produs(cod,tip,pret));
        }
        pret=0;
        double reducere=0;

        for(int i=0;i<b;i++){
            cod=sc.next();
            for(int j=0;j<list.size();j++){
                if(cod.equals(list.get(j).cod)&&list.get(j).tip==(Character)'p'){
                    pret+=list.get(j).pret;
                }else if(cod.equals(list.get(j).cod)&&list.get(j).tip==(Character)'c'){
                    reducere+=list.get(j).pret;
                }
            }
        }
        System.out.printf("%.2f",(float)(pret*(1-reducere/100)));

    }
}
