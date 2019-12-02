import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr = new int [n+2][m+2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0||i==arr.length-1)arr[i][j]=0;
                else if(j==0||j==arr[i].length-1)arr[i][j]=0;
                else arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<arr.length-1;i++){
            for(int j=1;j<arr[i].length-1;j++){
                int []aux={arr[i-1][j],arr[i][j],arr[i+1][j],arr[i][j+1],arr[i][j-1]};
                System.out.println(out(aux));
            }
        }
    }
    static int out(int []arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}