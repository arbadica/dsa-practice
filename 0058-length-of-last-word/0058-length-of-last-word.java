class Solution {
    public int lengthOfLastWord(String s) {
        int x=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
              x=i;
              break;
            }
        }
int cnt=0;
        for(int i=x;i>=0;i--){
            if(s.charAt(i)==' '){
              break;
            }
            else{
                cnt++;
            }
        }

return cnt;

    }
}