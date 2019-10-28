
public class Carti{
    int valoare;
    String culoare;
    int contor=0;
    Carti(int valoare, String culoare){
        this.valoare=valoare;
        this.culoare=culoare;
        this.contor++;
    }
    void increment(Carti x){
        x.contor++;
        if(x.contor==3){
            System.out.println(x.valoare+x.culoare);
            System.exit(0);
        }
    }
}

import java.util.*;
public class ECCPR{
    public static void main(String [] args){
        int valoare;
        String culoare;
        int n;
        boolean x=true;
        Scanner sc=new Scanner(System.in);
        ArrayList<Carti>list=new ArrayList<Carti>();
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            valoare=sc.nextInt();
            culoare=sc.nextLine();
            if(list.size()>0){
                for(int j=0;j<list.size();j++){
                    if(valoare==list.get(j).valoare&&culoare.equals(list.get(j).culoare)){
                        list.get(j).increment(list.get(j));
                        x=false;
                    }
                }
            }else list.add(new Carti(valoare,culoare));
            if(x==true&&list.size()>0){
                list.add(new Carti(valoare,culoare));
            }
            x=true;
        }
        System.out.println("JOC OK");
    }
}