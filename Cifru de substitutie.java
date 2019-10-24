import java.util.*;
public class ECCPR{
    public static void main(String []args){
        String s;
        String x,y="";
        Scanner sc= new Scanner(System.in);
        HashMap<Character,Character>myMap=new HashMap<Character,Character>();
        s=sc.nextLine();
        while(sc.hasNext()){
            x=sc.next();
            myMap.put((Character)x.charAt(0),(Character)x.charAt(2));
        }
        for(int i=0;i<s.length();i++){
            if((Character)myMap.get(((Character)s.charAt(i)))!=null){
                y+=(Character)myMap.get(((Character)s.charAt(i)));
            }else{
                y+=s.charAt(i);
            }
        }
        System.out.println(y);
        
    }
}