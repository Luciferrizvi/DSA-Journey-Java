import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        if(s.length() % 2 != 0) return false;

        else{
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                
                if(ch=='(' || ch=='{' || ch=='['){
                    st.push(ch);
                }
                else if(ch==')'){
                    if(st.isEmpty()) return false;
                    if(st.peek()=='(') st.pop();
                    else return false;
                }
                else if(ch==']'){
                    if(st.isEmpty()) return false;
                    if(st.peek()=='[') st.pop();
                    else return false;
                }
                else if(ch=='}'){
                    if(st.isEmpty()) return false;
                    if(st.peek()=='{') st.pop();
                    else return false;
                }
            }
        }
        if(st.size() == 0) return true;
        else return false;
    }
}