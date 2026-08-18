class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=n;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                ans=i;
            }
        }
        return ans;
    }
}