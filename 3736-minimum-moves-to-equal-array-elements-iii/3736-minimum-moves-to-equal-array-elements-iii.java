class Solution {
    public int minMoves(int[] nums) {
        
        Arrays.sort(nums);
        int sum=0;
        int x=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=x){
                sum=sum+(x-nums[i]);
            }
            else{
                break;
            }
        }

        return sum;
    }
}