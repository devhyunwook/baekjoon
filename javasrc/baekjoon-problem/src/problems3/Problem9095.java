package problems3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9095 {
    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tot = Integer.parseInt(br.readLine());
        if (tot > 11) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (tot-->0) {
            int num = Integer.parseInt(br.readLine());
            int[] dp = new int[11];

            dp[0]=1;
            dp[1]=1;
            dp[2]=2;

            for (int i=3; i<=num; i++) {
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }
            sb.append(dp[num]+"\n");
        }
        System.out.println(sb);
    }
}
