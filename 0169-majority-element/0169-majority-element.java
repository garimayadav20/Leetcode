class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxCount=   Integer.MIN_VALUE;
        int maxElement=Integer.MIN_VALUE;

        for( int i:nums){
            int count=map.getOrDefault(i,0)+1;
            map.put(i,count);

              if (count > maxCount) {
                maxCount = count;
                maxElement = i;
    }
        }
        return maxElement;
    
      
    }
}