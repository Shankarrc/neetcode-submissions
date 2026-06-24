class Solution {

    int ans=Integer.MIN_VALUE;
    void rec(int index,int product,int nums[]){

         ans=Math.max(ans,product);

        if(index==nums.length) return ;

        rec(index+1,nums[index]*product,nums);
    }
    public int maxProduct(int[] nums) {
        
        for(int i=0;i<nums.length;i++){

            rec(i+1,nums[i],nums);
        }
        return ans;
    }
}
