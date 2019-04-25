package problems2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Problem1158 {
    public void scan() throws IOException {
        // 조세퍼스 문제
        // 1.수를 입력 받는다
        // 2.입력받은 N에 따라 숫를 뒤로 옮긴다
        // 3.N번째 수를 제거 하고 출력 변수에 넣는다
        // 4.출력한다
        // [1,2,3,4,5,6,7]

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1
        String[] inputNums = br.readLine().split(" ");
        int totalNum = Integer.parseInt(inputNums[0]);
        int cirNum = Integer.parseInt(inputNums[1]);
        StringBuilder res = new StringBuilder();
        res.append("<");
        Queue<Integer> queue = new ArrayDeque<>();

        //큐 생성
        for (int i=1; i<=totalNum; i++) {
            queue.add(i);
        }

        // totalNum 만큼 반복
        while (totalNum-->0) {
            //2
            for (int i=0; i<cirNum; i++) {
                if (i == (cirNum-1)) {
                    res.append(queue.poll());
                    if (totalNum != 0)
                        res.append(", ");
                } else {
                    queue.add(queue.poll());
                }
            }
        }
        res.append(">");
        System.out.println(res);
    }
}
