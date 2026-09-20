class Solution {
    public int[] searchRange(int[] nums, int target) {

        return new int[]{first(nums,target) ,  last(nums,target)};
    }
        //1st occurance
        public int first(int[]nums,int target){
            int index=-1;
            int low=0,high=nums.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[mid]==target){
                   index=mid;
                   high=mid-1;
                   

                } 

                else if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;

                }
                 

            }return index;

        }

        //last occurance
        public int last(int[]nums,int target){
            int index=-1;
            int low=0,high=nums.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[mid]==target){
                    index=mid;
                    low=mid+1;

                } 

                else if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                    
                }
                 

            }return index;
        }
    

}