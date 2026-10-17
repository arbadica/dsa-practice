class Solution {
    public int singleNonDuplicate(int[] nums) {

       int s=0;
       int e=nums.length-1;
       
       while(s<e){
        int mid=s+(e-s)/2;
        if(mid%2==0){
            if(nums[mid]==nums[mid+1]){
                s=mid+2;
            }
            else{
                e=mid;
            }
        }

         if(mid%2!=0){
            if(nums[mid]==nums[mid-1]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }

          if(s==e){
            break;
          }

       }
        
        return nums.length==1?nums[0]:nums[s];
    }
}