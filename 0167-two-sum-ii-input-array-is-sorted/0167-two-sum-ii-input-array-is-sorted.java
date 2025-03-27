class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                
                return arr;
                }
            }
        }
        return new int[]{};
    }
}