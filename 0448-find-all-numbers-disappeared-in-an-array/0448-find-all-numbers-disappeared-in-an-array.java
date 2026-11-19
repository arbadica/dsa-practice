class Solution {
    public static boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return false;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
         
         List<Integer> res = new ArrayList<>();

         Arrays.sort(nums);

         int k=0;
        for(int i=0;i<nums.length;i++){
            k++;
          if(search(nums,k)==false){
            res.add(k);
          }
        }

        return res;
    }
}