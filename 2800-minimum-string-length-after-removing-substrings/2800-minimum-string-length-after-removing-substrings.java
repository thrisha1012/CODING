class Solution {
    public int minLength(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            if(stack.peek()=='A' && ch=='B'){
                stack.pop();
            }
            else if(stack.peek()=='C' && ch=='D'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}