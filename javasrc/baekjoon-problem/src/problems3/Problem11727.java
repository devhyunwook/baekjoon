package problems3;

public class Problem11727 {

    public static int[] dp;
    public static int scan(int num) {
        // n이 0,1인 경우는 1
        if (num == 0 || num == 1) {
            return 1;
        }
        // dp[num]에 값이 있는 경우 그 값을 출력
        if (dp[num] > 0) {
            return dp[num];
        }
        dp[num] = 2*(scan(num-2)) + scan(num-1);
        dp[num] %= 10007;

        return dp[num];
    }
}
