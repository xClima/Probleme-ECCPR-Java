import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Nave>list = new ArrayList<>();
        Nave nava = new Nave(sc.nextInt(),sc.nextInt());
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(new Nave(sc.nextInt(),sc.nextInt()));
            nava.atac(list.get(i));
        }
        System.out.println(nava.scor);
    }
}

public class Nave{
    int first,second,life;
    static int scor=0;
    Nave(int first, int second){
        this.first=first;
        this.second=second;
        this.life=first;
    }
    void atac(Nave p){
        while(p.first>=0||this.first>=0){
            this.first-=p.second;
            if(this.first<0) break;
            p.first-=this.second;
        }
        if(p.first<0){
            scor++;
        }
        if(this.first<0){
            this.first=this.life;
        }
    }
}