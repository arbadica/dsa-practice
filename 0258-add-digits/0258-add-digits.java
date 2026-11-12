class Solution {
    public int addDigits(int num) {
      int sum=0;
        while(num!=0){
            System.out.println("Num"+num);
           int rem=num%10;
            System.out.println("Rem"+rem);
           sum+=rem;
            System.out.println("sum"+sum);
           num=num/10;
           System.out.println("num"+num);
           if(sum>=10 && num==0){
            num=sum;
            sum=0;
           }
        }

         return sum;
    }
}