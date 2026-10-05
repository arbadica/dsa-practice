class Solution {
    public int maxArea(int[] arr) {
        int l=0,r=arr.length-1;
        int maxWater=0;

        while(l<r){
            int width=r-l;
            int minht=Math.min(arr[l],arr[r]);
            int currentWater=width*minht;
            maxWater=Math.max(maxWater,currentWater);
            if(arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}