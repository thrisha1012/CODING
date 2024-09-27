class Solution {
    public int[] kWeakestRows(int[][] nums, int k) {
        int r=nums.length;
        int c=nums[0].length;
        int[][]arr=new int[r][2];
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                if(nums[i][j]==1){
                    sum=sum+nums[i][j];
                }       
            }
            arr[i][0]=sum;
            arr[i][1]=i;
        }
        for(int i=0;i<r-1;i++){
            for(int j=0;j<r-i-1;j++){
                if(arr[j][0]>arr[j+1][0]){
                    int[] temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i][1];

        }
        return res;
        
    }
}