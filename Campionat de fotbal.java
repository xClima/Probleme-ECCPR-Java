public class Clasament{
    String nume;
    int puncte,goluri_date,goluri_primite;
    Clasament(String nume){
        this.nume=nume;
    }
    @Override
    public String toString(){
        return this.nume+" "+this.puncte+" "+this.goluri_date+" "+this.goluri_primite;
    }
}
import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        int n,m;
        ArrayList<Clasament>set= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        String team1,team2,junk;
        int scor1,scor2,v1,v2;
        for(int i=0;i<m;i++){
            v1=0;
            v2=0;
            team1=sc.next();
            scor1=sc.nextInt();
            junk=sc.next();
            scor2=sc.nextInt();
            team2=sc.next();
            for(int j=0;j<set.size();j++){
                if(set.get(j).nume.equals(team1)){
                    v1=1;
                }
                if(set.get(j).nume.equals(team2)){
                    v2=1;
                }
            }
            if(v1==0){
                set.add(new Clasament(team1));
            }
            if(v2==0){
                set.add(new Clasament(team2));
            }
            for(int j=0;j<set.size();j++){
                if(set.get(j).nume.equals(team1)){
                    set.get(j).goluri_date+=scor1;
                    set.get(j).goluri_primite+=scor2;
                    if(scor1>scor2){
                        set.get(j).puncte+=3;
                    }else if(scor1==scor2){
                        set.get(j).puncte+=1;
                    }
                }
                if(set.get(j).nume.equals(team2)){
                    set.get(j).goluri_date+=scor2;
                    set.get(j).goluri_primite+=scor1;
                    if(scor1<scor2){
                        set.get(j).puncte+=3;
                    }else if(scor1==scor2){
                        set.get(j).puncte+=1;
                    }
                }
            }
        }
        Collections.sort(set,new Comparator<Clasament>(){
            @Override 
            public int compare( Clasament t1,  Clasament t2){
                if(t1.puncte>t2.puncte){
                    return -1;
                }else if(t1.puncte==t2.puncte){
                    if(t1.goluri_date-t1.goluri_primite>t2.goluri_date-t2.goluri_primite){
                        return -1;
                    }else{
                        return 1;
                    }
                    
                }else{
                    return 1;
                }
            }
            
        });
        for(int j=0;j<set.size();j++){
            System.out.println(set.get(j));
        }
    }
}