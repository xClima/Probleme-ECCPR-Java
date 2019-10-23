import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import static java.util.stream.Collectors.*;

public class ECCPR {

    public static void main(String []args){
        String text;
        String[] words;
        Map< String,Integer> map =new TreeMap<>();
        Scanner sc= new Scanner(System.in);
        text=sc.nextLine();
        words = text.split(" ");
        for(int i=0;i<words.length;i++){
            words[i]=words[i].toLowerCase();
        }
        Integer aux=1;
        for(int i=0;i<words.length;i++){
            if(words[i].length()!=0) {
                if (map.get(words[i]) == null) {
                    map.put(words[i], aux);
                } else {
                    aux = map.get(words[i]) + 1;
                    map.put(words[i], aux);
                    aux = 1;
                }
            }
        }
        Map<String, Integer> sorted = map;
        sorted = map
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        for(int i=0;i<map.size();i++) {
                System.out.println(sorted.keySet().toArray()[i] + " " + sorted.values().toArray()[i]);
        }

    }
}

