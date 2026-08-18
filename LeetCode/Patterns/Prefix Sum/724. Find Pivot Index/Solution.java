class Solution {
    public int pivotIndex(int[] nums) {
        int leftval=0;
        int rightval=0;
        int leftzero=0;
        for(int i=1;i<nums.length;i++){
            leftzero+=nums[i];
        }
        if(leftzero==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                leftval+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                rightval+=nums[k];
            }
            if(leftval==rightval){
                return i;
            }
            leftval=0;
            rightval=0;
        }
        return -1;
    }
}