class Solution {
    public String toHex(int num) {
        StringBuilder sb=new StringBuilder();
        char hex[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num==0) return "0";
        
            long digit=num & 0xFFFFFFFFL;
            while(digit>0){
            sb.append(hex[(int)(digit%16)]);
            digit=digit/16;
        }
        return sb.reverse().toString();
        
    }
}