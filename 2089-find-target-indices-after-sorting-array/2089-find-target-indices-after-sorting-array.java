class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<Integer>();
   
     int last=-1;
     int first=-1;
     

     int start=0;
     int end=nums.length-1;

     while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            first=mid;
            end=mid-1;
        }

        else if(nums[mid]<target){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
     }

     start=0;
     end=nums.length-1;
     while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            last=mid;
            start=mid+1;
        }

        else if(nums[mid]<target){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
     }

if(first==-1 && last==-1){
    return ans;
}
else{
     for(int i=first;i<=last;i++){
       ans.add(i);
     }
}
     return ans;
    }
}