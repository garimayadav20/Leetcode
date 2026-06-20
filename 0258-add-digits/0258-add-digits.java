class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        int sum=1+(num-1)%9;
        if(sum !=0  && sum>=10) {
            sum+=sum;
           
        }
        return sum;
    }
}