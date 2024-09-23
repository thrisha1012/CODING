class Solution {
    public int nthUglyNumber(int n) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        int i2=0,i3=0,i5=0;
        for(int i=0;i<n;i++){
            int next2=list.get(i2)*2;
            int next3=list.get(i3)*3;
            int next5=list.get(i5)*5;
            int next=Math.min(next2,Math.min(next3,next5));

            if(next==next2) i2++;
            if(next==next3) i3++;
            if(next==next5) i5++;

            list.add(next);
        }
        return list.get(n-1);
    }
}