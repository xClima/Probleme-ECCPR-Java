import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        String theStr="",num;
        String[] strArr;
        int[] intArr;
        for(int j=0;j<n;j++){
            theStr = sc.next();
            strArr = theStr.split(",");
            intArr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                num = strArr[i];
                intArr[i] = Integer.parseInt(num);
            }
            theStr="";
            for(int i=intArr.length-1;i>=0;i--){
                if(intArr[i]!=0&&cnt==0){
                    theStr+=Integer.toString(intArr[i]);
                    theStr+=",";
                }else if(intArr[i]==0){
                    cnt++;
                }else if(intArr[i]!=0&&cnt!=0){
                    theStr+=")";
                    theStr+=Integer.toString(cnt);
                    theStr+=",";
                    if(intArr[i]<9){
                        theStr+=Integer.toString(intArr[i]);
                    }else{
                        while(intArr[i]>0){
                            theStr+=Integer.toString(intArr[i]%10);
                            intArr[i]/=10;
                        }
                    }
                    theStr+="(";
                    theStr+=",";
                    cnt=0;
                }
            }
            for(int i=theStr.length()-2;i>=0;i--){
                System.out.print(theStr.charAt(i));
            }
            System.out.println();
        }
    }
}