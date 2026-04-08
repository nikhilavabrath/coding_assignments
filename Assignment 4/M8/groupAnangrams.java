//Given an array of strings strs, group the anagrams together. You can return the answer in any order.

import java.util.*;
class groupAnagrams {
    public List<List<String>> Solution(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}