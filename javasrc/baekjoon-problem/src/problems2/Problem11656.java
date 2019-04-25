package problems2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem11656 {
    public void scan() throws IOException {
        //접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
        //baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
        //문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String tmp = br.readLine();

        //1.문자열만큼 for문을 실행
        //2.앞의 글자를 제거하며 String[] 에 저장
        //3.String[] 을 Arrays.sort로 정렬
        //4.정렬된 String[] 출력

        int tot = tmp.length();
        ArrayList<String> res = new ArrayList<>();
        res.add(tmp);
        for (int i=1; i<tot; i++) {
            res.add(tmp.substring(i));
        }
        Collections.sort(res);

        for (String resString : res) {
            System.out.println(resString);
        }
    }
}
