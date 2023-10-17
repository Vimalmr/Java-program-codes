class Solution {
    public String addStrings(String num1, String num2) {
        int n1=num1.length(), n2=num2.length();
        int i=n1-1,j=n2-1,carry=0;
        String num3 = new String("");
        while(i>=0 && j>=0){
            int s = (num1.charAt(i--) - '0') + (num2.charAt(j--) - '0')+carry;
            carry = s/10;
            s=s%10;
            num3 = String.valueOf(s)+num3;
        }
        if(i<0){
            while(j>=0){
                int s = (num2.charAt(j--) - '0')+carry;
                carry = s/10;
                s=s%10;
                num3 = String.valueOf(s)+num3;
            }
        }
        else if(j<0){
            while(i>=0){
                int s = (num1.charAt(i--) - '0')+carry;
                carry = s/10;
                s=s%10;
                num3 = String.valueOf(s)+num3;
            }
        }
        if(carry!=0){
            num3 = String.valueOf(carry)+num3;
        }
        return num3;
    }
}
