import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<String>list= new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        int max=0,suma=0;
        String aux="";
        for(int i=0;i<list.size();i++){
            for(int j=0;j<x;j++){
                if(list.get(i).length()==1){
                    suma+=Integer.parseInt(list.get(i));
                }else{
                    for(int z=0;z<list.get(i).length()-1;z++){
                        aux+=Integer.toString(Math.abs(Character.getNumericValue(list.get(i).charAt(z))-Character.getNumericValue(list.get(i).charAt(z+1))));
                    }
                    suma+=Integer.parseInt(aux);
                    list.set(i,Integer.toString(Integer.parseInt(aux)));
                    aux="";
                }
            }
            if(suma>max){
                max=suma;
                n=i;
            }
            suma=0;
        }
        System.out.println(max+" "+n);
    }
}