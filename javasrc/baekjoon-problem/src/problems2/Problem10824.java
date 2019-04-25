package problems2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10824 {
    public void scan() throws IOException {
        //네 자연수 A, B, C, D가 주어진다. 이때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오.
        //두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 즉, 20과 30을 붙이면 2030이 된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tmpNums = new StringTokenizer(br.readLine(), " ");

        String firstNum = tmpNums.nextToken()+tmpNums.nextToken();
        String lastNum = tmpNums.nextToken()+tmpNums.nextToken();

        System.out.println(Long.parseLong(firstNum) + Long.parseLong(lastNum));
    }
}
