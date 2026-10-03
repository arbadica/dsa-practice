class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=1,k=1;

        while(r<nums.length){
            if(nums[l]!=nums[r]){
                nums[k] = nums[r];
                k++;
            }
            l++;
            r++;
        }

        return k;
    }
}