import java.util.*;
import java.lang.Character;
public class ECCPR{
    public static boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
    public static void main(String []args){
        String judet,numar,text;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            judet=sc.next();
            numar=sc.next();
            text=sc.next();
            if(judet.equals("AB")||judet.equals ("AR")||judet.equals ("AG")||judet.equals ("B")||judet.equals ("BC")||judet.equals ("BH")||judet.equals ("BN")||judet.equals ("BT")||judet.equals ("BV")|| judet.equals("BR")|| judet.equals("BZ")||judet.equals ("CS")||judet.equals ("CL")||judet.equals ("CJ")||judet.equals ("CT")||judet.equals ("CV")||judet.equals ("DB")||judet.equals ("DJ")|| judet.equals("GL")||judet.equals ("GR")||judet.equals ("GJ")||judet.equals ("HR")||judet.equals ("HD") ||judet.equals("IL")||judet.equals ("IS")||judet.equals ("IF")||judet.equals ("MM")||judet.equals ("MH")||judet.equals ("MS")||judet.equals ("NT")||judet.equals ("OT")||judet.equals ("PH")||judet.equals ("SM")||judet.equals ("SJ")||judet.equals ("SB")||judet.equals ("SV")||judet.equals ("TR")||judet.equals ("TM")||judet.equals ("TL")||judet.equals ("VS")||judet.equals ("VL")||judet.equals ("VN")){
                if(isInteger(numar)){
                    if((numar.length()>=2)&&(numar.length()<=3)){
                        if(((text.length()==3))&&(Character.isUpperCase(text.charAt(0)))&&(Character.isUpperCase(text.charAt(1)))&&(Character.isUpperCase(text.charAt(2)))){
                            System.out.println(judet+" "+numar+" "+text);
                        }
                    }
                }
            }
        }
    }

}