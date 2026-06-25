class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         

         int total=0;
         int tank=0;
         int st=0;
         for(int i=0;i<cost.length;i++){

            int gain=gas[i]-cost[i];

            total+=gain;
            tank+=gain;

            if(tank<0){

                st=i+1;
                tank=0;
            }
         }

         return total>=0?st:-1;
    }
}
