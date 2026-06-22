class Solution {
    int n;
    int dp[];
    int rec(int index,int cost[]){

        if(index>=n) return 0;
        if(dp[index]!=-1) return dp[index];
        int take=rec(index+1,cost)+cost[index];
        int dot=rec(index+2,cost)+cost[index];
         return dp[index]=Math.min(take,dot);
    }
    public int minCostClimbingStairs(int[] cost) {
        
        this.n=cost.length;
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
         return Math.min(rec(1,cost),rec(0,cost));
    }
}
