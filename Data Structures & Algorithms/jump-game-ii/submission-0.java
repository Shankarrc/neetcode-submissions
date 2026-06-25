class Solution {
    public int jump(int[] nums) {
        

        int l=0,r=0;
        int n=nums.length;
        int jump=0;
        while(r<n-1){

            int father=0;
            for(int i=l;i<=r;i++){
                father=Math.max(father,nums[i]+i);
            }

            l=r+1;
            r=father;
            jump++;

        }
        return jump;
    }
}
