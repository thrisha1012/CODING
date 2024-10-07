class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        StringBuilder sb=new StringBuilder();
        int fre=1;
        for(int i=0;i<n;i++){
            char c=chars[i];
            while(i<n-1 && chars[i]==chars[i+1]){
                fre++;
                i++;
            }
            sb.append(c);
            if(fre>1){
                sb.append(fre);
            }
            fre=1;
        }
        int index=0;
        String cstr=sb.toString();
        char[]cchar=cstr.toCharArray();
        for(int i=0;i<cchar.length;i++){
            chars[i]=cchar[i];
        }
        return cchar.length;
        
    }
}