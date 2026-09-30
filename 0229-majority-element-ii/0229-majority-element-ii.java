class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();

       List<Integer> arr = new ArrayList<>();


        int appear=nums.length/3;
        
        for(int i:nums){
            int count=map.getOrDefault(i,0)+1;
            map.put(i,count);
           
            if(count>appear && !arr.contains(i)){
                arr.add(i);
               
                
            }

        }


        return arr;
    }
}