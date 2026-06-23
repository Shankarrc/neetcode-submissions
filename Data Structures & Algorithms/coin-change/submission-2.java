class Solution {
        int n,dp[][];

    public int rec(int i,int coins[],int amt){

        if(0==amt) return 0;

        if(i>=n||0>amt) return (int)1e9;
        if(dp[i][amt]!=-1){
            return dp[i][amt];
        }
         
        int take=rec(i,coins,amt-coins[i]);

        if(take !=(int)1e9){
            take+=1;
        }
        int nottake=rec(i+1,coins,amt);
        return dp[i][amt]=Math.min(take,nottake);
    }
    public int coinChange(int[] coins, int amount) {
        
        this.n=coins.length;
        dp=new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int res=rec(0,coins,amount);
        return res>=(int)1e9?-1:res;
    }
}
