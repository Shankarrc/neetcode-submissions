class Solution {
    public int findMin(int[] nums) {


       int minval=nums[0];

       int l=0;
       int h=nums.length-1;
       while(l<=h){

        int mid=(l+h)/2;

        if(nums[l]<=nums[mid]){
            minval=Math.min(minval,nums[l]);
            l=mid+1;
        }
        else{
            minval=Math.min(minval,nums[mid]);
            h=mid-1;
        }
       } 
       return minval;
    }
}
