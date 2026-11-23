package PraticeProblems;

import java.util.LinkedHashMap;

public class FrequencyOfEachChar {
    static void main() {
        String g= "Java is a versatile and robust lanaguage.";
        LinkedHashMap<Character,Integer> lhm= new LinkedHashMap<>();
        for(Character c:g.toCharArray()){
            if(lhm.containsKey(c)){
                lhm.put(c,lhm.get(c)+1);
            } else {
                lhm.put(c,1);
            }
        }
        System.out.println("Linkedhaspmap:"+lhm.entrySet());

    }
}
