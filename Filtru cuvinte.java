import java.util.*;
public class ECCPR{
    public static void main(String []args){
        ArrayList<String> words = new ArrayList<String>();
        String x,s,y="";
        int n;
        String q;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            x=sc.next();
            words.add(x);
        }
        for(int i=0;i<words.size();i++){
            for(int j=0;j<words.get(i).length();j++){
                y+='*';
            }
            s=s.replace(words.get(i), y);
            y="";
            }
        System.out.println(s);
        }
    }