class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
        /*for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp = nums[i];
                while(i<nums.length-1 ){
                    nums[i] = nums[i+1];
                    i++;
                }
                nums[nums.length-1] = temp;
            }
            i = -1;
        }*/
    
    }
}