import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Elevi>list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(new Elevi(sc.next(),sc.next(),sc.nextInt()));
        }
        int cnt=0;
        int nr = sc.nextInt();
        Collections.sort(list, new Comparator<Elevi>(){
            @Override
            public int compare(Elevi a, Elevi b){
                if(a.timp>=b.timp){
                    return 1;
                }else return -1;
            }
        });
        for(int i=0;i<list.size();i++){
            if(list.get(i).timp<=nr){
                cnt++;
            }
        }
        System.out.println(cnt);
        for(int i=0;i<list.size();i++){
            if(list.get(i).timp<=nr){
                System.out.println(list.get(i).nume+" "+list.get(i).prenume+" "+list.get(i).timp);
            }
        }
    }
}

public class Elevi{
    String nume;
    String prenume;
    int timp;
    Elevi(String nume, String prenume, int timp){
        this.nume=nume;
        this.prenume=prenume;
        this.timp=timp;
    }
}