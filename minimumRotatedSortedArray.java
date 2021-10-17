// Time complexity: O(log N)
// Space complexity: O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class minimumRotatedSortedArray {
    public int findMin(int[] nums) {
        //null case
        if(nums == null || nums.length == 0) return -1;
        
        if(nums.length == 1) return nums[0];
        
        int low = 0;
        int high = nums.length - 1;
        
        if(nums[0] < nums[high])
        {
            return nums[0];
        }
        
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(nums[mid] > nums[mid + 1])
            {
                return nums[mid + 1];
            }
            
            else if (nums[mid] < nums[mid - 1])
            {
                return nums[mid];
            }
            
            else if(nums[low] < nums[mid])
            {
                low = mid + 1;
            }
            
            else
            {
                high = mid + 1;
            }
        }
        
        return -1;
    }
}