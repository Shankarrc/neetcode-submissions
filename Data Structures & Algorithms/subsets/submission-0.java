class Solution {
    public void rec(int index,int []nums,List<List<Integer>>ans,List<Integer>res){

        if(index==nums.length){

            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[index]);
        rec(index+1,nums,ans,res);
        res.remove(res.size()-1);
        rec(index+1,nums,ans,res );
        
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
         rec(0,nums,ans,res);
         return ans;

    }
}
