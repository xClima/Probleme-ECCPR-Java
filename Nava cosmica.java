import java.util.*;
public class Eccpr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Punct>list = new ArrayList<>();
        double suma=0;
        int index=0;
        for(int i=0;i<n;i++){
            list.add(new Punct(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
        }
        Punct start = new Punct(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        while(list.size()>0){
            double min = start.calcDistanta(list.get(0));
            for(int i=0;i<list.size();i++){
                  min=(start.calcDistanta(list.get(i))<=min)?start.calcDistanta(list.get(i)):min;
                  index=(start.calcDistanta(list.get(i))<=min)?i:index;
            }
            suma+=min;
            start = list.get(index);
            list.remove(index);
        }
        System.out.printf("%.2f",suma);
    }
}

public class Punct{
    double x,y,z;
    Punct(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    double calcDistanta(Punct p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2)+Math.pow(this.z-p.z,2));
    }
}