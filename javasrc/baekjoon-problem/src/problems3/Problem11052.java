package problems3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11052 {
    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 총 tmpNum 가지
        int tmpNum = Integer.parseInt(br.readLine());

        // p[1]개를 팔고 나머지는 dp[n-1]
        // p[2]개를 팔고 나머지는 dp[n-2]
        // 즉 2차원 for문에서 j는 이전 dp 찾기

        int[] dp = new int[tmpNum+1];
        int[] p = new int[tmpNum+1];

        String[] tmpCards = br.readLine().split(" ");
        for (int i = 1; i<tmpNum; i++) {
            p[i] = Integer.parseInt(tmpCards[i-1]);
        }

        for (int i=1; i<=tmpNum; i++) {
            for (int j=1; j<=i; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + p[j]);
            }
        }
        System.out.println(dp[tmpNum]);
    }
}
