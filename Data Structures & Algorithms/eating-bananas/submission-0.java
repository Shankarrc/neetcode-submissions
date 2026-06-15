class Solution {
    boolean check(int piles[],int k,int ch){

        double cnt=0;
        for(int a:piles){

            cnt+=Math.ceil((double)a/ch);
        }
        return cnt<=k;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int low=0;
        int high=0;
        for(int i=0;i<piles.length;i++){

            low=Math.min(low,piles[i]);
            high=Math.max(high,piles[i]);

        }
        int ans=0;
        while(low<=high){

            int mid=(low+high)/2;

            if(check(piles,h,mid)){
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
