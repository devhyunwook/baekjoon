package problems3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1463 {
    public void scanBottonTop() throws IOException {
        // 다이나믹 프로그래밍 1
        //        정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
        //        X가 3으로 나누어 떨어지면, 3으로 나눈다.
        //        X가 2로 나누어 떨어지면, 2로 나눈다.
        //        1을 뺀다.
        //        정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

        // 정리
        // 1.값을 입력 받는다
        // 2.0과 1은 최소값이 0
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tmpInput = Integer.parseInt(br.readLine());

        int[] dp = new int[tmpInput+1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i<=tmpInput; i++) {
            //1로 빼는 경우
            dp[i] = dp[i-1] + 1;
            //2로 나누는 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            }
            //3으로 나누는 경우
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3]+1);
            }
        }
        System.out.println(dp[tmpInput]);
    }
}
