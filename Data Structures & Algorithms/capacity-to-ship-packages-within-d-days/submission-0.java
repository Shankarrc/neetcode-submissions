class Solution {


    boolean check(int weights[],int days,int cap){
        
        int d=1;
        int capacity=0;
        for(int a:weights ){

            if(a+capacity>cap){
                d++;
                capacity=0;
            }
            capacity+=a;
        }
        return days>=d;
    }
    public int shipWithinDays(int[] weights, int days) {
        

        int low=0;
        int high=0;
        for(int a:weights){
            low=Math.max(a,low);
            high+=a;
        }
        int ans=0;
        while(low<=high){

            int mid=(low+high)/2;


            if(check(weights,days,mid)){
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