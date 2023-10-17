class Solution {
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<>();
        int res = 0;
        int num = 0;
        int sign = 1;  //This is for sign of number(either +ve or Negative)
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10 + (int)(c-'0');
            }
            else if(c=='+'){
                res+=sign*num;
                sign=1;
                num=0;
            }
            else if(c=='-'){
                res+=sign*num;
                sign=-1;
                num=0;
            }
            else if(c=='('){
                stk.push(res);
                stk.push(sign);
                res=0;
                sign=1;
            }
            else if(c==')'){
                res+=sign*num;
                sign = stk.pop();
                res = res*sign + stk.pop();
                sign = 1;
                num = 0;
            }
        }
        if(num>0){
            res+=sign*num;
        }
        return res;
    }
}
