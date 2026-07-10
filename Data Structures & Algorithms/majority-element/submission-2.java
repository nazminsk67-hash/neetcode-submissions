class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0) return nums[0];
        int cnt=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}