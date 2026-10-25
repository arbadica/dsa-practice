class Solution {
    public long sumAndMultiply(int n) {
        //int n = 10203004;
        String st="";
        st+=n;
        long x=0;
        long sum=0;
        int k=0;
        while(n!=0){
          if(st.charAt(k)!='0'){
          x=x*10+(st.charAt(k)-'0');
          }
          sum+=n%10;
          n=n/10;
          k++;
        }

        return sum*x;
    }
}