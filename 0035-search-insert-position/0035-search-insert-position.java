class Solution {
    public int searchInsert(int[] arr, int k) {
         int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k) return mid;
            if(arr[mid]>k){
                high=mid-1;
            }
            if(arr[mid]<k){
                low=mid+1;
            }
        }
        return low;
        
    }
}