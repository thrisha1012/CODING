class Solution {
    public int findMinDifference(List<String> arr) {
        int [] min=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            String time=arr.get(i);
            int h=Integer.parseInt(time.substring(0,2));
            int m=Integer.parseInt(time.substring(3));
            min[i]=h*60+m;
        }
        Arrays.sort(min);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<min.length-1;i++){
            ans=Math.min(ans,min[i+1]-min[i]);
        }
        return Math.min(ans,24*60-min[min.length-1]+min[0]);
    }
}