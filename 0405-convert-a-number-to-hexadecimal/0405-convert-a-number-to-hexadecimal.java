class Solution {
    public String toHex(int num) {
        StringBuilder sb=new StringBuilder();
        char hex[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num==0) return "0";
        while(num!=0){
            int digit=num & 0xf;
            sb.append(hex[digit]);
            num >>>=4;
        }
        return sb.reverse().toString();
        
    }
}