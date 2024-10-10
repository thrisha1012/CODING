class Solution {
    public String longestCommonPrefix(String[] str) {
        // if(str.length==0) return "";
        // String prefix=str[0];
        // for(int i=0;i<str.length;i++){
        //     while(str[i].indexOf(prefix)!=0){
        //         prefix=prefix.substring(0,prefix.length()-1);
        //     }
        // }+
        // return prefix;

        Arrays.sort(str);
        String prefix=str[0];
        for(int i=1;i<str.length;i++){
            int j=0,count=0;
            while(j<prefix.length() && prefix.charAt(j)==str[i].charAt(j)){
                count++;
                j++;
            }
            String res="";
            for(int k=0;k<count;k++){
                res=res+str[i].charAt(k);
            }
                prefix=res;
            
        }
        return prefix;

    }
}