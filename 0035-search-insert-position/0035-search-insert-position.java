class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int low=0 ,high=arr.length-1;

        while(low<=high){
          int mid=high+(low-high)/2;

          if(arr[mid]==target){
            return mid;
          }

          if(arr[mid]<target){
             low=mid+1;
          }

          else{
            high=mid-1;
          }
        }

       return high+1;
    }
}