package problems2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem1406 {
    public void scan() throws IOException {
        //        L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
        //        D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
        //        B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
        //        삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
        //        P $	$라는 문자를 커서 왼쪽에 추가함

        // 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();

        // 첫번째 스택에 값 저장
        String tmp = br.readLine();
        for (int i=0; i<tmp.length(); i++) {
            first.push(tmp.charAt(i));
        }
        // 실행 카운트
        int exeCnt = Integer.parseInt(br.readLine());

        while (exeCnt-->0) {
            String[] tmpExe = br.readLine().split(" ");
            if (tmpExe[0].equalsIgnoreCase("L")) {
                if (first.size() > 0) {
                    second.push(first.pop());
                }
            } else if (tmpExe[0].equalsIgnoreCase("D")) {
                if (second.size() > 0) {
                    first.push(second.pop());
                }
            } else if (tmpExe[0].equalsIgnoreCase("B")) {
                if (first.size() > 0) {
                    first.pop();
                }
            } else if (tmpExe[0].equalsIgnoreCase("P")) {
                first.push(tmpExe[1].charAt(0));
            }
        }

        int cnt = first.size();
        for (int i=0; i<cnt; i++){
            second.push(first.pop());
        }
        cnt = second.size();
        for (int i=0; i<cnt; i++)  {
            System.out.print(second.pop());
        }
    }
}
