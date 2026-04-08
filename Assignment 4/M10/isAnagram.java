//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class isAnagram {
    public boolean Solution(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
            for(int i=0;i<26;i++){
                if(freq[i]!=0){
                    return false;
                }
            }
return true;
    }
    
}