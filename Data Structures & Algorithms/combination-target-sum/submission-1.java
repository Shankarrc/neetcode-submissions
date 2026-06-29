class Solution {
    public void rec(int index,int nums[],int tar,List<List<Integer>> ans,List<Integer>res){

        if(tar==0){
            ans.add(new ArrayList<>(res));
            return;
        }

        if(index>=nums.length||tar<nums[index]){
            return;
        }
        res.add(nums[index]);
        rec(index,nums,tar-nums[index],ans,res);
        res.remove(res.size()-1);
        rec(index+1,nums,tar,ans,res);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
            Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
        rec(0,nums,target,ans,res);
        return ans;
    }
}
