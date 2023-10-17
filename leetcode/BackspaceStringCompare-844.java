class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        String rs = new String("");
        String rt = new String("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!stk1.isEmpty())
                    stk1.pop();
            }
            else{
                stk1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!stk2.isEmpty())
                    stk2.pop();
            }
            else{
                stk2.push(t.charAt(i));
            }
        }
        while(!stk1.isEmpty()){
            rs = rs+stk1.pop();
        }
        while(!stk2.isEmpty()){
            rt = rt+stk2.pop();
        }
        if(rs.equals(rt)){
            return  true;
        }
        return false;
    }
}
