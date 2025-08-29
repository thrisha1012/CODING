class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int currarea=Math.min(height[left],height[right])*(right-left);
            maxarea=Math.max(currarea,maxarea);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxarea;
        
    }
}