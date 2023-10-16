class Solution {
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<>();
        int sum=0,num=0,n=s.length(),flag=0;
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                num=0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    num = num*10+(int)(s.charAt(i++)-'0');
                }
                i--;
                if(flag==1){
                    sum = stk.pop() / num;
                    stk.push(sum);
                    flag=0;
                }
                else if(flag==2){
                    sum = stk.pop() * num;
                    stk.push(sum);
                    flag=0;
                }
                else if(flag==3){
                    stk.push(num);
                    flag=0;
                }
                else if(flag==4){
                    stk.push(-num);
                    flag=0;
                }
                else{
                    stk.push(num);
                }
            }
            else if(s.charAt(i)=='*'){
                flag=2;
            }
            else if(s.charAt(i)=='/'){
                flag=1;
            }
            else if(s.charAt(i)=='+'){
                flag=3;
            }
            else if(s.charAt(i)=='-'){
                flag=4;
            }
        }
        sum=0;
        while(!(stk.isEmpty())){
            sum+=stk.pop();
        }
        return sum;
    }
}
