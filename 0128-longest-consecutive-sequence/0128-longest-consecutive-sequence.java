class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }

        int count = 1;
        int longest = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;



        //      Brute Force 
        /*
        int longest =0;
        for(int i =0;i<nums.length;i++){
            int current = nums[i];
            int count = 1;
        
            while(linearSearch(nums, current + 1)){
                current++;
                count++;
            }
            longest = Math.max(longest,count);
        }
        return longest;
        
        }
        public boolean linearSearch(int[] nums, int target){
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
        */
    }
}