class Solution {
    public void rec(int index,int nums[],int tar,List<List<Integer>>ans,List<Integer>res){

        if(tar==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=index;i<nums.length;i++){

            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            if(tar<nums[i]){
            break;
            }
            res.add(nums[i]);
            rec(i+1,nums,tar-nums[i],ans,res);
            res.remove(res.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>res=new ArrayList<>();

        rec(0,candidates,target,ans,res);
        return ans;
    }
}
