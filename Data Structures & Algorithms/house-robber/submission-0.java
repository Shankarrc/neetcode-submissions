class Solution {
    int n,dp[];

    int rec(int  i,int nums[]){

        if(i>=n) return 0;
        if(dp[i]!=-1)return dp[i];
        int take=rec(i+1,nums);
        int dot=rec(i+2,nums)+nums[i];

        return dp[i]=Math.max(take,dot);
    }
    public int rob(int[] nums) {
        this.n=nums.length;

        dp=new int[nums.length];

        Arrays.fill(dp,-1);

        return rec(0,nums);
    }
}
