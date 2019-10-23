import java.util.Scanner;

public class ECCPR {

    public static void main(String []args){
        String text;
        String words;
        char alpha,beta;
        int a,b,out1=0,out2=0,out3=0;
        Scanner sc=new Scanner(System.in);
        alpha=sc.next().charAt(0);
        beta=sc.next().charAt(0);
        alpha=Character.toUpperCase(alpha);
        beta=Character.toUpperCase(beta);
        a=sc.nextInt();
        b=sc.nextInt();
        text=sc.nextLine();
        while (sc.hasNext()) {
            words = sc.next();
            words=words.toUpperCase();
            if(alpha==words.charAt(0)&&beta==words.charAt(words.length()-1)&&((words.length())<a)){
                out1++;
            }
            if(alpha==words.charAt(0)&&beta==words.charAt(words.length()-1)&&((words.length())<b&&(words.length())>=a)){
                out2++;
            }
            if(alpha==words.charAt(0)&&beta==words.charAt(words.length()-1)&&((words.length())>=b)){
                out3++;
            }
        }

        System.out.println(out1+" "+out2+" "+out3);

    }
}