package Day13_HashMap;

import java.util.HashMap;
import java.util.Map;

public class nonRepeatedWord {

    public static void main(String[] args) {
        String s = "AABCDBE";
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            char word = s.charAt(i);
            if(hm.containsKey(word)){
                //for repeated word
                hm.put(word, hm.get(word)+1);
            } else {
                //for non-repeated word
                hm.put(word, 1);
            }
        }
        System.out.println("Stored word: "+hm);
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
                if(entry.getValue()==1){
                    System.out.println(entry.getKey() + " :"+ entry.getValue());
                    break;

                }

        }
    }
}
