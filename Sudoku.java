import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][]arr= new int[9][9];
        HashSet<Integer>s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<9;i++){
            s1.clear();
            s2.clear();
            for(int j=0;j<9;j++){
                s1.add(arr[i][j]);
                s2.add(arr[j][i]);
            }
            if(s1.size()!=9||s2.size()!=9){
                System.out.println("Gresit");
                System.exit(0);
            }
        }
        for(int i=0;i<9;i+=3){
            s1.clear();
            for(int j=i;j<i+3;j++){
                s1.add(arr[i][j]);
                s1.add(arr[i+1][j]);
                s1.add(arr[i+2][j]);
            }
            if(s1.size()!=9){
                System.out.println("Gresit");
                System.exit(0);
            }
        }
        System.out.println("Corect");
    }
}