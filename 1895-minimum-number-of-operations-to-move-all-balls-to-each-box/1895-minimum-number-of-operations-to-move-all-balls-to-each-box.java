class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int op=0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1'){
                    op=op+Math.abs(i-j);
                }
            }
            arr[i]=op;
        }
        return arr;
    }
}