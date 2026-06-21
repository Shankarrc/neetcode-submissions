class Solution {
    int dp[];
    int rec(int n,int i){

         
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        
        return dp[i]=rec(n,i+1)+rec(n,i+2);
    }
    public int climbStairs(int n) {
        
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return rec(n,0);
    }
}
