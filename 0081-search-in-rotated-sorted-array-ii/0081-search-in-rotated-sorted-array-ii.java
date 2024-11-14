class Solution {
    public boolean search(int[] arr, int target) {
        int start=0,end=arr.length-1;
        boolean ans=false;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans=true;
                break;
            }

            else if(arr[mid]==arr[start] && arr[mid]==arr[end]){ //to handle duplicate element case
                start++;
                end--;
            }

            else if(arr[start]<=arr[mid]){ //left sorted
                if(arr[start]<=target && arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }else{ //right sorted
                if(arr[mid]<target && arr[end]>=target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }

        return ans;
    }
}