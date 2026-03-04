class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] c = new int[26];

        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            if (c[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            c[t.charAt(i) - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s, t));
    }
}