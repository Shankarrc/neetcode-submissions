class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix[0].length;

        for(int i=0;i<matrix.length;i++){

            int l=0;
            int h=n-1;
            if(matrix[i][0]<=target && target<=matrix[i][n-1]){

                while(l<=h){

                    int mid=(l+h)/2;

                    if(matrix[i][mid]==target){
                        return true;
                    }
                    else if(matrix[i][mid]>target){
                        h=mid-1;
                    }
                    else{
                        l=mid+1;
                    }
                }
            }
        }
        return false;
    }
}
