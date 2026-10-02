class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        

        Set<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);
       
        int n=nums.length;
        for(int i=0;i<n;i++){

            if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
}

             
           
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;

                }
                else if(sum>0){
                    k--;

                }
                else{

                    List<Integer> l1 = new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(nums[k]);

                    if(set.add(l1)){
                         list.add(l1);

                    }

                    

                   

                    j++;
                    k--;



                }
            }
        }
            
        
        return list;
    }
}