import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int find = sc.nextInt();
        Collections.sort(list);
        while(list.size()>0){
            if(list.size()==1){
                System.out.println(list.get(0));
                System.exit(0);
            }
            if(list.get(list.size()/2)>find){
                System.out.println(list.get(list.size()/2));
                list.subList(list.size()/2,list.size()).clear();
            }else if(list.get(list.size()/2)<find){
                System.out.println(list.get(list.size()/2));
                list.subList(0, list.size()/2).clear();
            }else{
                System.out.println(find);
                System.exit(0);
            } 
        }
    }
}