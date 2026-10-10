
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> arr=new Stack<Character>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                arr.push(s.charAt(i));
            }
            else {
                if(arr.empty())
                return false;
                else if(s.charAt(i)==')'){
                   if(arr.peek()!='(')
                   return false;
                   else
                   arr.pop();
                }
                else if(s.charAt(i)=='}'){
                   if(arr.peek()!='{')
                   return false;
                   else
                   arr.pop();
                }
                else {
                   if(arr.peek()!='[')
                   return false;
                   else
                   arr.pop();
                }
            }
        }
        return arr.empty();
    }
}