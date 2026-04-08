/*You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.*/


import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();
        
        for(String s : tokens){
            
            if(s.equals("+")){
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }
            else if(s.equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }
            else if(s.equals("*")){
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }
            else if(s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        
        return st.pop();
    }
}