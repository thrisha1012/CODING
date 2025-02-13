class Solution {
    public int calculate(String s) {
        int num=0,res=0,sign=1;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='+' || ch=='-'){
                res=res+(num*sign);
                sign=(ch=='-' ? -1 : 1);
                num=0;
            }
            else if(ch=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
            }
            else if(ch==')'){
                res=res+(num*sign);
                res=res*st.pop();
                res=res+st.pop();
                num=0;
                
            }
        }
        return res+(num*sign);
        
        
    }
}