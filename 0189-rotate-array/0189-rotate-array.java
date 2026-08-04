class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        System.arraycopy(temp, 0, nums, 0, n);
        /*int count=0;
       
        while(count<k){
            int temp = nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--){
                nums[i+1] = nums[i];
                
            }
            nums[0] = temp;
            count++;
        }*/
    }
}