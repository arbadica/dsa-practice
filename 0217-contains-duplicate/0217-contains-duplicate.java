class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int l=0,r=1;
        Arrays.sort(nums);
        while(r<nums.length){
           if(nums[l]==nums[r]){
            return true;
           }
           else{
            l++;
            r++;
           }
        }

        return false;
    }
}