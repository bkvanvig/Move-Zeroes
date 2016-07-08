public class Solution {
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++){
            if (nums[i]==0)
                continue;
            else{
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        for(int i = len-1; i>=writeIndex; i--){
            nums[i] = 0;
        }
    }
}