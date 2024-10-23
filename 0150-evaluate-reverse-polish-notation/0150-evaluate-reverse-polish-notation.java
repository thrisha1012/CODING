class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for(String ch:tokens)
        {
                switch(ch)
                {
                    case "+":{
                        stack.push(stack.pop()+stack.pop());
                        break;
                    }
                    case "-": {
                        int n1=stack.pop();
                        int n2=stack.pop();
                        stack.push(n2-n1);
                        break;
                    }
                    case "*": {
                        stack.push(stack.pop()*stack.pop());
                        break;
                    }
                    case "/": {
                        int n1=stack.pop();
                        int n2=stack.pop();
                         stack.push(n2/n1);
                        
                        break;
                    }
                    default:{
                        stack.push(Integer.parseInt(ch));
                        break;
                    }
                    
                
            }
            
        }
        return stack.pop();
        
    }
}