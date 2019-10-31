import java.util.*;
public class ECCPR{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=1,max=0,pos=0,index=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
            if(list.get(i)>=0) pos++;
        }
        for(int i=0;i<list.size()-1;i++){
            if((list.get(i)>=0&&list.get(i+1)<0)||(list.get(i)<0&&list.get(i+1)>=0)){
                cnt++;
                max=(cnt>=max)?cnt:max;
                index=(cnt>=max)?i:index;
            }else cnt=1;
        }
        System.out.println(max);
        for(int i=index-max+2;i<=index+1;i++){
            System.out.print(list.get(i)+" ");
        }
        double x=list.size();
        System.out.println();
        System.out.printf("+:%.2f%s -:%.2f%s",(((double)pos/x)*100),"%",(((x-(double)pos)/x)*100),"%");
    }
}