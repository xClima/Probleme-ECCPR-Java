import java.util.*;
public class qwe {
    public static void main(String[] args) {
        int nr=1,aux=0;
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        while(myObj.hasNext() == true){
            nr = myObj.nextInt();
            aux+=nr;
        }
        System.out.println(21*n-aux);
    }
}