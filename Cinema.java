public class Cinema{
    int h,m,p;
    String n;
    Cinema(int h, int m, int p, String n){
        this.h=h;
        this.m=m;
        this.p=p;
        this.n=n;
    }
}
import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        int h,m,p;
        String n;
        Scanner sc = new Scanner(System.in);
        ArrayList<Cinema>list=new ArrayList<>();
        String s=sc.next();
        int hh=Integer.parseInt(s.substring(0,2));
        int mm=Integer.parseInt(s.substring(3));
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            s=sc.next();
            h=Integer.parseInt(s.substring(0,2));
            m=Integer.parseInt(s.substring(3));
            if(h>hh){
                list.add(new Cinema(h,m,sc.nextInt(),sc.nextLine()));
            }else if(h==hh){
                if(m>=mm){
                    list.add(new Cinema(h,m,sc.nextInt(),sc.nextLine()));
                }else{sc.nextInt();sc.nextLine();}
            }else{sc.nextInt();sc.nextLine();}
                
            
        }
        Collections.sort(list,new Comparator<Cinema>(){
            @Override
            public int compare(Cinema f1, Cinema f2){
                if(f1.h>f2.h){
                    return 1;
                }else if(f1.h==f2.h){
                    if(f1.m>f2.m){
                        return 1;
                    }else if(f1.m==f2.m){
                        if(f1.p>f2.p){
                            return 1;
                        }
                        else return -1;
                    }else return -1;
                }else return -1;
            }
            });
            System.out.println(list.get(0).n);
    }
}