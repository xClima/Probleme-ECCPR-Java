import java.util.*;
public class Eccpr{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++) list.add(sc.nextInt());
        Collections.sort(list);
        list.
        stream().
        filter(e -> isPrime(e)==true&&e>=k).
        forEach(e -> {
            System.out.println(e);
            System.exit(0);
        });
        System.out.println(-1);
    }
    public static boolean isPrime(int num) {
		   if (num<=1){
		       return false;
		   }
		   for (int i=2;i<=Math.sqrt(num);i++) {
		       if (num%i==0) {
		           return false;
		       }
		   }
		   return true;
	}
}