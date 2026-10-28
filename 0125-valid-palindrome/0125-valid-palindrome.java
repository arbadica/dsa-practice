class Solution {
    public boolean isPalindrome(String s) {

    String st="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                st = st + Character.toLowerCase(c);
            }
        }

    int start=0;
    int end=st.length()-1;
    String ts=st;
    char[] arr =ts.toCharArray();
    while(start<=end){
      char temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;

    }
   ts = new String(arr);
    return st.equals(ts);

    }
}