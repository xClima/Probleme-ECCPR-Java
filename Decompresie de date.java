import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)!='('){
                    System.out.print(s.charAt(j));
                }else{
                    if(s.charAt(j+2)==','){
                        System.out.print(s.charAt(j+1)+",");
                        if(s.charAt(j+4)==')'){
                            for(int x=0;x<Character.getNumericValue(s.charAt(j+3))-1;x++){
                                System.out.print("0,");
                            }
                            System.out.print("0");
                            j+=4;
                        }else{
                            for(int x=0;x<Character.getNumericValue(s.charAt(j+3))*10+Character.getNumericValue(s.charAt(j+4))-1;x++){
                                System.out.print("0,");
                            }
                            System.out.print("0");
                            j+=5;
                        }
                    }else{
                        System.out.print(s.charAt(j+1)+""+s.charAt(j+2)+",");
                        for(int x=0;x<Character.getNumericValue(s.charAt(j+4))-1;x++){
                                System.out.print("0,");
                            }
                            System.out.print("0");
                            j+=5;
                    }
                }
            }
            System.out.println();
        }
    }
}