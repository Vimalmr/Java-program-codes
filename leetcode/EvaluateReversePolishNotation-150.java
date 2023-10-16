class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int n = tokens.length;
        for(int i=0;i<n;i++){
            if(tokens[i].equals("/")){
                int nn = stk.pop();
                stk.push(stk.pop()/nn);
            }
            else if(tokens[i].equals("*")){
                int nn = stk.pop();
                stk.push(stk.pop()*nn);
            }
            else if(tokens[i].equals("+")){
                stk.push(stk.pop() + stk.pop());
            }
            else if(tokens[i].equals("-")){
                int nn = stk.pop();
                stk.push(stk.pop()-nn);
            }
            else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }
        return stk.pop();
    }
}
