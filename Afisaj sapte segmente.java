import java.util.Scanner;

public class ECCPR {

    public static void main(String []args){
        int n1,n2,n3,n4,n5,n6,n7,n8;
        char junk;
        String x;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            x=sc.nextLine();
            n1=Character.getNumericValue(x.charAt(0));
            n2=Character.getNumericValue(x.charAt(2));
            n3=Character.getNumericValue(x.charAt(4));
            n4=Character.getNumericValue(x.charAt(6));
            n5=Character.getNumericValue(x.charAt(8));
            n6=Character.getNumericValue(x.charAt(10));
            n7=Character.getNumericValue(x.charAt(12));
            n8=Character.getNumericValue(x.charAt(14));

            if(n1==0 && n2==1 && n3==1 && n4==0 && n5==0 && n6==0 && n7==0 && n8<=1 ){
                System.out.print(1);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==1 && n2==1 && n3==0 && n4==1 && n5==1 && n6==0 && n7==1 && n8<=1 ){
                System.out.print(2);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==1 && n2==1 && n3==1 && n4==1 && n5==0 && n6==0 && n7==1 && n8<=1 ){
                System.out.print(3);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==0 && n2==1 && n3==1 && n4==0 && n5==0 && n6==1 && n7==1 && n8<=1 ){
                System.out.print(4);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==1 && n2==0 && n3==1 && n4==1 && n5==0 && n6==1 && n7==1 && n8<=1 ){
                System.out.print(5);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==1 && n2==0 && n3==1 && n4==1 && n5==1 && n6==1 && n7==1 && n8<=1 ){
                System.out.print(6);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==1 && n2==1 && n3==1 && n4==0 && n5==0 && n6==0 && n7==0 && n8<=1 ){
                System.out.print(7);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==1 && n2==1 && n3==1 && n4==1 && n5==1 && n6==1 && n7==1 && n8<=1 ){
                System.out.print(8);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==1 && n2==1 && n3==1 && n4==1 && n5==0 && n6==1 && n7==1 && n8<=1 ){
                System.out.print(9);
                if(n8==1){
                    System.out.print(".");
                }
            }else
            if(n1==1 && n2==1 && n3==1 && n4==1 && n5==1 && n6==1 && n7==0 && n8<=1 ){
                System.out.print(0);
                if(n8==1){
                    System.out.print(".");
                }
            }else{break;}



        }

    }
}