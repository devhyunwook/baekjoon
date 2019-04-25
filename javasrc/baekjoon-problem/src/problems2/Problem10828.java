package problems2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem10828 {
    public void scan() throws IOException {
        // 숫자를 입력 받는다
        // 명령어 숫자, 명령어를 받는다

        // 맴버변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int initNum = Integer.parseInt(br.readLine());

        while (initNum-->0) {
            String[] sb = br.readLine().split(" ");

            if (sb[0].equalsIgnoreCase("push")) {
                stack.push(Integer.parseInt(sb[1]));
            } else if (sb[0].equalsIgnoreCase("pop")) {
                if (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                } else {
                    System.out.println(-1);
                }
            } else if (sb[0].equalsIgnoreCase("size")) {
                System.out.println(stack.size());
            } else if (sb[0].equalsIgnoreCase("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (sb[0].equalsIgnoreCase("top")) {
                if (!stack.isEmpty()) {
                    System.out.println(stack.peek());
                } else {
                    System.out.println(-1);
                }

            } else {
            }
        }
    }
}
