import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String>s = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            s.add(sc.next());
        }
        for(int i=0;i<s.size();i++){
            for(int j=0;j<s.size();j++){
                if(s.get(i).equals("red")&&s.get(j).equals("blue"))s.add("purple");
                if(s.get(i).equals("red")&&s.get(j).equals("yellow"))s.add("orange");
                if(s.get(i).equals("yellow")&&s.get(j).equals("blue"))s.add("green");
                if(s.get(i).equals("orange")&&s.get(j).equals("blue"))s.add("brown");
            }
        }
        boolean verif=false;
        while(sc.hasNext()){
            String nume = sc.next();
            n = sc.nextInt();
            ArrayList<String>list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(sc.next());
            }
            for(int i=0;i<list.size();i++){
                verif=false;
                for(int j=0;j<s.size();j++){
                    if(list.get(i).equals(s.get(j))){
                        verif=true;
                        break;
                    }
                }
                if(verif==false)break;
            }
            if(verif==true)System.out.println(nume);
        }
    }
}