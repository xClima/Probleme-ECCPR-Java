import java.util.ArrayList;
import java.util.Scanner;
public class ECCPR{
    public static void main( String []args){
        int N,M,P;
        ArrayList<Integer> vec = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        M=sc.nextInt();
        N=sc.nextInt();
        P=sc.nextInt();
        for(int i=0;i<N;i++){
            vec.add(i);
        }
        int index=P-1;
        M=M-1;
        while(vec.size()>1){
            index+=M;
            while(index>=vec.size()){
                index=index-vec.size();
            }

            vec.remove(index);

        }
        System.out.print(vec.get(0)+1);


    }
}