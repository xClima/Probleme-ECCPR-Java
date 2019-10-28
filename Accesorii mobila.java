import java.util.*;
public class ECCPR{
    public static void main(String []args){
        double n,nr,cnt=0;
        int R=0,S=0,P=0,B=0,H=0;
        char x;
        Set<Character>s=new HashSet<Character>();
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            nr=sc.nextInt();
            for(int j=0;j<nr;j++){
               x=sc.next().charAt(0);
               if(x=='R'){
                   R++;
               }else if(x=='P'){
                   P++;
               }else if(x=='S'){
                   S++;
               }else if(x=='B'){
                   B++;
               }else if(x=='H'){
                   H++;
               }
               s.add(x);
            }
            if((s.size()==5)&&(R%4==0)&&(P==S)&&(B%2==0)&&(H%2==0)&&(H<=P)){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
                cnt++;
            }
            R=0;S=0;P=0;B=0;H=0;
            s.clear();
        }
        System.out.printf("/n%.2f",(cnt/n));
    }
}