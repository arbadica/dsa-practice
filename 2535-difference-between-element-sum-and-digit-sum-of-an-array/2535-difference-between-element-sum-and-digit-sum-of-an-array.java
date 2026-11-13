class Solution {
    public int digsum(int num){
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        
        int elemSum=0;
        int digSum=0;
        for(int i=0;i<nums.length;i++){
            elemSum=elemSum+nums[i];
            digSum=digSum+digsum(nums[i]);
        }

        return Math.abs(elemSum-digSum);
    }
}