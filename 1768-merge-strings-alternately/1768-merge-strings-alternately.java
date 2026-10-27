class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        
        int s=0;
        int e=0;

        int k=word1.length();
        int l=word2.length();

        while(k!=0 || l!=0){
         
         if(k!=0){
            str=str+word1.charAt(s);
            s++;
            k--;
         }

         if(l!=0){
            str=str+word2.charAt(e);
            e++;
            l--;
         }

        }

        while(k!=0){
         str=str+word1.charAt(s);
         s++;
         k--;
        }

        while(l!=0){
         str=str+word2.charAt(e);
         e++;
         l--;
        }


         return str;
    }
}