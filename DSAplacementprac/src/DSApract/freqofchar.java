package DSApract;

import java.util.HashMap;

public class freqofchar {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();

        String s = "hello my name anna from tamil";

        for (char c : s.toCharArray()) {
            //if (c == ' ') continue; // optional: skip spaces

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}



//using containsKey
//
//if(map.containsKey(c)) {
//    map.put(c, map.get(c) + 1);
//} else {
//    map.put(c, 1);
//}