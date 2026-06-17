class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int ans=1;
        double range=Math.pow(2,30);
        while(ans<n  &&  n<=range){
            ans*=2;
            
        }
        return ans==n;    
    }

}