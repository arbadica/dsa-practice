class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod=1;
        int prod2=1;
        int cnt0=0;
        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            prod=prod*nums[i];

            if(nums[i]!=0){
                prod2=prod2*nums[i];
            }

            if(nums[i]==0){
                cnt0++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            ans[i]=prod/nums[i];
            }
            else if(cnt0<=1){
               ans[i]=prod2;
            }
        }


         return ans;
    }
}