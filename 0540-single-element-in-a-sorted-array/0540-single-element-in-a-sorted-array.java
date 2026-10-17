class Solution {
    public int singleNonDuplicate(int[] nums) {

       for(int i=1;i<nums.length-1;i++){
          if(nums[0]!=nums[1]){
            return nums[0];
          }
          if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
            return nums[i];
          }
       } 

       return nums.length==1?nums[0]:nums[nums.length-1];
    }
}