class Solution {
    public int findDuplicate(int[] nums) {
        boolean visited[]=new boolean[nums.length+1];
        for(int i:nums){
            if(visited[i]){
                return i;
            }
            visited[i]=true;
        
        }
        return -1;
        
    }
}