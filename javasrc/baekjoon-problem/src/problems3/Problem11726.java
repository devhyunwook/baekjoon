package problems3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11726 {
    public void scan() throws IOException {
        //문제
        //2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
        //아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

        // 값을 입력 받는다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        //bottom-up 방식으로 접근하자
        int[] dp = new int[num+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<=num; i++) {
            dp[i] = dp[i-2] + dp[i-1];
            dp[i] %= 10007;
        }
        System.out.println(dp[num]);
    }
}
