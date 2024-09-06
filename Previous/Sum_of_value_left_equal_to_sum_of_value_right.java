package Previous;

public class Sum_of_value_left_equal_to_sum_of_value_right 
{
    public static boolean canPartition(int[] nums) 
    {
        int totalSum = 0;
        for (int num : nums) 
        {
            totalSum += num;
        }
        
        if (totalSum % 2 != 0) 
        {
            return false;
        }
        
        int target = totalSum / 2;
        int n = nums.length;
        
        boolean[][] dp = new boolean[n + 1][target + 1];
        
        for (int i = 0; i <= n; i++)
        {
            dp[i][0] = true;
        }
        
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= target; j++) 
            {
                if (j >= nums[i - 1]) 
                {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                } 
                else 
                {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[n][target];
    }
    
    public static void main(String[] args) {
        int[] nums = {6, 3, 7, 5, 3};
        System.out.println(canPartition(nums));
    }
}