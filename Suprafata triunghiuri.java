import java.util.*;
public class Eccpr{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int n = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int arie=0;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                for(int x=0;x<list.size();x++){
                    if(i==j||j==x)continue;
                    if(Math.pow(list.get(x),2)==Math.pow(list.get(j),2)+Math.pow(list.get(i),2)) arie+=(list.get(j)*list.get(i))/2;
                }
            }
        }
        System.out.println(arie/2);
    }
}