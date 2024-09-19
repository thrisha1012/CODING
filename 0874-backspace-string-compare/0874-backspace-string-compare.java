class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> stack1=new Stack();
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='#') {
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
           }
           else stack1.push(s.charAt(i));
            
        }
        Stack <Character> stack2=new Stack();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            } 
            else stack2.push(t.charAt(i));
        }
        return stack1.equals(stack2);

    }
}