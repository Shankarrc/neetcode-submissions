class Solution {
    public boolean check(int val,int nums[],int k){

        int lar=1;
        int sum=0;
        for(int a:nums){

            if(a+sum>val){
                lar++;
                sum=0;
            }
            sum+=a;
        }
        return lar<=k;
    }
    public int splitArray(int[] nums, int k) {
        
        int low=0;
        int high=0;
        for(int a:nums){
            low=Math.max(a,low);
            high+=a;
        }
        int ans=high;
        while(low<=high){

            int mid=(low+high)/2;

            if(check(mid,nums,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}