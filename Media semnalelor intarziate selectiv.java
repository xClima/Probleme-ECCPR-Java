import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double nr;
        int cnt=0;
        double [][]arr= new double [100][100];
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                arr[i][j]=0;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<10;j++){
                nr=sc.nextDouble();
                arr[i][j]=nr;
            }
        }
        double average=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                for(int z=0;z<n;z++){
                    average+=arr[z][j];
                }
                average/=n;
                String s = String.format(Locale.US, "%.2f", average);
                System.out.print(s+" ");
                average=0;
            }
            System.out.println();
            for(int x=1;x<n;x++){
                for(int z=x;z<99;z++){
                    for(int j=99;j>=0;j--){
                        try{
                        arr[z][j]=arr[z][j-1];
                        }catch(Exception e){
                            arr[z][j]=0;
                        }
                    }
                }
            }
        }
    }
}