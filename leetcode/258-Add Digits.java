class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int sum;
        while(true){
            sum = 0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            if(sum<10){
                break;
            }
            num = sum;
        }
        return sum;
    }
}
