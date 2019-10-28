import java.util.*;
import javafx.util.Pair; 
public class ECCPR{
    public static void main(String [] args){
        String x;
        ArrayList <Pair <String,String> > l =new ArrayList <Pair <String,String> > (); 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            x=sc.next();
            if(!l.contains(new Pair <String,String>(x.substring(0,2),x.substring(3)))){
                l.add(new Pair <String,String>(x.substring(0,2),x.substring(3)));
            }

        }
        Collections.sort(l, new Comparator<Pair<String, String>>() {
            @Override
            public int compare(final Pair<String, String> o1, final Pair<String, String> o2) {
                if (o1.getValue().compareTo(o2.getValue())>0) {
                return -1;
            } else if (o1.getValue().equals(o2.getValue())) {
                if(o1.getKey().compareTo(o2.getKey())>0){
                    return -1;
                }else if(o1.getKey().compareTo(o2.getKey())<0) {return 1;}
                else return 0;
                
            } else {
                return 1;
            }
            }
        });
        for(int i=l.size()-1;i>=0;i--){
  
            System.out.println(l.get(i).getKey() + "-" + l.get(i).getValue()); 

        }
        
    }
}