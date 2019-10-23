import java.util.*;
public class ECCPR{
    static int functie(int x){
        return (int)(x*0.9+2);
    }
    public static void main(String[]args){
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[][]img=new int[n][m];
        double suma=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                img[i][j]=sc.nextInt();
                img[i][j]=(functie(img[i][j])-img[i][j]);
                suma+=img[i][j];
            }
        }
        System.out.printf("%.2f",(double)(suma/(m*n)));
    }
}