package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//5
//20 10 35 30 7
public class Problem10818 {
    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자의 갯수
        int tmpNum = Integer.parseInt(br.readLine());
        // 숫자를 받아오는 부분(공백으로 구분)
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            int tmpNowNum = Integer.parseInt(st.nextToken());

            min = Math.min(min, tmpNowNum);
            max = Math.max(max, tmpNowNum);
        }
        System.out.println(min + " " + max);
    }
}
