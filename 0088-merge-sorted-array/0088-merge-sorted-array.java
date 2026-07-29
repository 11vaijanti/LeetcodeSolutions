class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Time complextity is O((m+n)^2)
        //space complexity O(1)
       /* int j = 0;
        for(int i = m; i<m+n;i++){
            
            nums1[i] = nums2[j];
            j++;
        }
        for(int k=0;k<m+n;k++){
            for(int l=k;l<m+n;l++){
                if(nums1[k] > nums1[l]){
                    int temp = nums1[k];
                    nums1[k] = nums1[l];
                    nums1[l] = temp;
                }
            }
        }*/

    //Optimized code
    //Time complexity O(m+n)
    //Space complexity O(1)
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}