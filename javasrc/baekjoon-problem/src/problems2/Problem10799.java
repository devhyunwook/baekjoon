package problems2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem10799 {
    public void scan() throws IOException {
        // 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int resCnt = 0;
        // 괄호를 받는다
        String tmpShape = br.readLine();

        for (int i=0; i<tmpShape.length(); i++) {
            // ( 인 경우
            if (tmpShape.charAt(i) == '(') {
                stack.push(i);
            } else if (tmpShape.charAt(i) == ')') { // ) 인 경우
                if (stack.peek() + 1 == i) {
                    if (stack.size() > 1) {
                        stack.pop();
                        resCnt += stack.size();
                    } else {
                        stack.pop();
                    }
                } else {
                    stack.pop();
                    resCnt += 1;
                }
            }
        }
        System.out.println(resCnt);
    }
}
