class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        

        int n=nums.length;
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<=n-k;i++){

            int maxx=nums[i];
            for(int j=i;j<i+k;j++){
                maxx=Math.max(maxx,nums[j]);
            }
            ans.add(maxx);
        }
        int m=ans.size();
        int res[]=new int[m];
        for(int i=0;i<m;i++){

            res[i]=ans.get(i);
        }
        return res;
    }
}
