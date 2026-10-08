class Solution {
    public int trap(int[] arr) {
        int maxl=Integer.MIN_VALUE;
        int maxr=Integer.MIN_VALUE;
        int water=0;
        int maxh=arr[0];
        int index=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxh){
                maxh=arr[i];
                index=i;
            }
        }

        for(int i=0;i<index;i++){
            if(maxl>arr[i]){
                water=water+(maxl-arr[i]);
            }else{
                maxl=arr[i];
            }
        }

        for(int i=arr.length-1;i>index;i--){
            if(maxr>arr[i]){
                water=water+(maxr-arr[i]);
            }else{
                maxr=arr[i]; 
            }
        }

        return water;
    }
}