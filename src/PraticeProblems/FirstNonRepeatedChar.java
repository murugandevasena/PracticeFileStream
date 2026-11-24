package PraticeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    static void main() {
        String s = "murugan is a kind hearted person.";
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> repeated = new HashSet<>();
        for(Character c:s.toCharArray()){
            if(hs1.contains(c)){
                //System.out.println("First repeated character from string:"+hs1);
                repeated.add(c);
            } else {
                hs1.add(c);
            }
        }
        System.out.println("Repeated character: "+repeated);
        System.out.println("No repeated character: "+hs1);

        Map<String, Long> hmcheck = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("HmCheck: "+hmcheck);
    }
}
