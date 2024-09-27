class Solution {
    public int countBinarySubstrings(String s) {
        ArrayList<Integer>list=new ArrayList<>();
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                list.add(c);
                c=1;
            }
        }
        list.add(c);//last element
        int res=0;
        for(int i=1;i<list.size();i++){
            res=res+Math.min(list.get(i-1),list.get(i));
        }
        return res;
        
    }
}