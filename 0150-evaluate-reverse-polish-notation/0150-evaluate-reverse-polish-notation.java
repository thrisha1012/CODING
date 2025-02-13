class Solution {
    static boolean isop(String ch){
        return ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/");
    }
    public int evalRPN(String[] arr) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].matches("-?\\d+")){
                st.push(Integer.parseInt(arr[i]));
            }
            else if(isop(arr[i])){
                int n2=st.pop();
                int n1=st.pop();

                switch(arr[i]){
                    case "+": st.push(n1+n2); break;
                    case "-": st.push(n1-n2); break;
                    case "*": st.push(n1*n2); break;
                    case "/": st.push(n1/n2); break;
                }
            }
        }
        return st.pop();
        
    }
}