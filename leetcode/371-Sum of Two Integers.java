class Solution {
    public int getSum(int a, int b) {
        int xor=a, carry=b, temp;
        while(carry!=0){
            temp = xor;
            xor = xor ^ carry;
            carry = (carry & temp)<<1;
        }
        return xor;
    }
}
