//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

import java.util.*;
class generatearenthesis {
    public List<String> solution(int n) {
        List<String> res = new ArrayList<>();
        solve("", 0, 0, n, res);
        return res;
    }
    void solve(String s, int open, int close, int n, List<String> res){
        if(s.length() == 2*n){
            res.add(s);
            return;
        }
        if(open < n){
            solve(s + "(", open + 1, close, n, res);
        }
        if(close < open){
            solve(s + ")", open, close + 1, n, res);
        }
    }
}