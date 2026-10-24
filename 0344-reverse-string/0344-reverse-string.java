class Solution {
    public void reverseString(char[] s) {

       int st=0;
       int e=s.length-1; 

       while(st<=e){
         char temp=s[e];
         s[e]=s[st];
         s[st]=temp;

         st++;
         e--;

       }
    }
}