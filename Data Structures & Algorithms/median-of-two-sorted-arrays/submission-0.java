class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        int arr[]=new int [n+m];

        int k=0;

        int i=0,j=0;
        while(i<n && j<m){

            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<n){
              arr[k++]=nums1[i++];
        }
        while(j<m){
            arr[k++]=nums2[j++];
        }
        
        int sum=n+m;
        int mid=(n+m)/2;
        if(sum%2==0){
            
            double res=(arr[mid]+arr[mid-1])/2.0;
            return res;
        }
        return arr[mid];
    }
}
