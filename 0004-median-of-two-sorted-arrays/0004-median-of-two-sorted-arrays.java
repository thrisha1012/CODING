class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int arr[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1){
            arr[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=nums2[j];
            k++;
            j++;
        }
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0) 
        return (double)(arr[n/2]+arr[n/2-1])/2.0;
        return (double)arr[n/2];
    }
}