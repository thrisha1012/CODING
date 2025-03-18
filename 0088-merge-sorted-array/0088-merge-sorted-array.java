class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<m;i++){
            list.add(nums1[i]);
        }
        for(int j=0;j<n;j++){
            list.add(nums2[j]);
        }
        
        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            nums1[i]=list.get(i);
        }
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(nums1[i]);
            if (i < list.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        
    }
}