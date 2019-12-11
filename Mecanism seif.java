import java.util.*;
public class Eccpr{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        List<Integer>list = new ArrayList<>();
        String [] s = sc.nextLine().split(" ");
        Arrays.stream(s).forEach( e -> list.add(Integer.parseInt(e)));
        int n = sc.nextInt();
        int suma=0;
        for(int i=0;i<n;i++){
            suma+=(sc.nextInt())*(sc.nextInt());
        }
        if(suma>=0)System.out.print(list.get(suma));
        else System.out.print(list.get(list.size()-1-suma));
    }
}