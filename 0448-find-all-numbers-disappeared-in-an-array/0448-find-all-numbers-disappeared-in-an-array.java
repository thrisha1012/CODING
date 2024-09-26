class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list=new ArrayList<>();
        boolean isavail[]=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            isavail[nums[i]]=true;
        }
        for(int i=1;i<isavail.length;i++){
            if(!isavail[i]){
                list.add(i);
            }
        }
        return list;
    }
}