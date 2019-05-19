package problems3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11057 {
    public void scan() throws IOException {
        // 11057 오르막 수
        // dp[자리의개수(0의 자리란 없다)][끝의수(0~9)]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tmpNum = Integer.parseInt(br.readLine());   // 자리수를 입력 받는다

        int dp[][] = new int[tmpNum+1][10];
        // 1자리수는 무조건 그수 하나이므로 1개로 초기화
        for (int i=0; i<10; i++) {
            dp[1][i] = 1;
        }

        // i, j, k (i=자리수, j=뒷자리, k=오르막수가 가능하도록 하는 변수)
        for (int i=2; i<=tmpNum; i++) { // 2즉 2자리 부터 시작(1자리는 위에서 초기화)
            for (int j=0; j<10; j++) {
                for (int k=0; k<=j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        //출력전에 모든 배열 더하기
        int res=0;
        for (int i=0; i<10; i++) {
            res += dp[tmpNum][i];
        }
        System.out.println(res%=10007);
    }
}
