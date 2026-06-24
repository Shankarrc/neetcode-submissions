class Solution {
    int dp[];

    boolean rec(int index,String s,HashSet<String>shan){

        if(index==s.length()) return true;

        if(dp[index]!=-1) return dp[index]==1;

        for(int i=index;i<s.length();i++){

            String str=s.substring(index,i+1);

            if(shan.contains(str)){

                if(rec(i+1,s,shan)){
                    dp[index]=1;
                    return true;
                }
            }
        }
        dp[index]=0;
        return false;

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        
            dp=new int[s.length()];
            Arrays.fill(dp,-1);
            HashSet<String>shan=new HashSet<>(wordDict);

            return rec(0,s,shan);

    }
}
