import java.util.*;
public class ECCPR{
    public static void main(String []args){
        int n,max=0,aux=0;
        char x,y;
        String nr;
        char []arr=new char[13];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            nr=sc.nextLine();
            arr=nr.toCharArray();
            for(int j=0;j<nr.length()-1;){
                x=nr.charAt(j);
                y=nr.charAt(j+2);
                arr[j]=y;
                arr[j+2]=x;
                j+=4;
            }
            String str = new String(arr);
            //System.out.println(str);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)!=' '){
                    int number = Character.getNumericValue(str.charAt(j));
                    if(number%2==1&&j!=0){
                        aux++;
                    }
                    if(j==0){
                        aux+=number;
                    }
                }
            }
            if(aux>max){
                max=aux;
            }
            aux=0;
        }
        System.out.print(max);
    }
}