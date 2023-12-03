/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.

2. Open brackets must be closed in the correct order.

3. Every close bracket has a corresponding open bracket of the same type.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean res = validP(str);
        System.out.println(res);
    }
    public static boolean validP(String str){
        int n = str.length();
        Stack st = new Stack<>();
        for(int i = 0; i < n; i++){
            char cVal = str.charAt(i);
            if(cVal == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(cVal == '}'){
                if(!st.isEmpty() && st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(cVal == ']'){
                if(!st.isEmpty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                st.push(cVal);
            }
        }
        return st.isEmpty();
    }
}
