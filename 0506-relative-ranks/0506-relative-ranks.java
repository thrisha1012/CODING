class Solution {
    public String[] findRelativeRanks(int[] score) {
        int arr[]=score.clone();
        int n=arr.length;
        Arrays.sort(arr);
        int max=0;
        HashMap<Integer,String>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(i==n-1){
                map.put(arr[i],"Gold Medal");
            }
            else if(i==n-2){
                map.put(arr[i],"Silver Medal");
            }
            else if(i==n-3){
                map.put(arr[i],"Bronze Medal");
            }
            else{
                map.put(arr[i],String.valueOf(n-i));
            }
        }
        String[] list=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            list[i]=map.get(score[i]);
        }
        return list;
    }
}