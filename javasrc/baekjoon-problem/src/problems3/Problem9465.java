package problems3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9465 {
    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long dp[][];
        long a[][];

        // 총 몇문제
        int examCnt = Integer.parseInt(br.readLine());
        while (examCnt-->0) {
            // 총 몇열
            int column = Integer.parseInt(br.readLine());

            dp = new long[3][column + 1];  // 0:아무것도 선택안함, 1:1행 선택, 2:2행선택
            a = new long[2][column + 1];   // 0:이전 1행선택한값, 1:이전 2행 선택한값

            // 열값 받기
            String[] row1 = br.readLine().split(" ");
            String[] row2 = br.readLine().split(" ");
            // a에 값 초기화
            for (int i = 0; i < column; i++) {
                a[0][i] = Long.parseLong(row1[i]);
                a[1][i] = Long.parseLong(row2[i]);
            }

            for (int i = 1; i <= column; i++) {
                dp[0][i] = Math.max(dp[0][i - 1], Math.max(dp[1][i - 1], dp[2][i - 1]));
                dp[1][i] = Math.max(dp[0][i - 1], dp[2][i - 1]) + a[0][i - 1];
                dp[2][i] = Math.max(dp[0][i - 1], dp[1][i - 1]) + a[1][i - 1];
            }

            long res = Math.max(dp[0][column], Math.max(dp[1][column], dp[2][column]));
            System.out.println(res);
        }
    }
}
