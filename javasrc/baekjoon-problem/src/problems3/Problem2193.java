package problems3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2193 {
    public void scan() throws IOException {
        //  d[n] = n자리 이친수
        // d[n] = d[n-1] + d[n-2]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tmpNum = Integer.parseInt(br.readLine());

        long[] dp = new long[tmpNum+1];

        dp[0] = 0;
        dp[1] = 1;
        for (int i=2; i<=tmpNum; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[tmpNum]);
    }
}
