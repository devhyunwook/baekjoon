package problems2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//(())())
//(((()())()
//(()())((()))
//((()()(()))(((())))()
//()()()()(()()())()
//(()((())()(
public class Problem9012 {
    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> tmpStack = new Stack<>();
        //숫자를 입력받는다 / 입력받은 수만큼 반복한다
        //String으로 문자를 입력받는다
        //String의 길이만큼 for문을 돌리며 push/pop을 수행한다

        int tryCnt = Integer.parseInt(br.readLine());
        StringBuilder res = new StringBuilder();
        while (tryCnt>0){
            String tmpLine = br.readLine();
//            System.out.println("STEP : " + tmpLine);

            boolean isVPS = false;
            char tmpChar;
            for (int i=0; i<tmpLine.length(); i++){
                tmpChar = tmpLine.charAt(i);
//                System.out.println(tmpChar);

                // '(' 이면 stack push
                if (tmpChar == '(') {
                    tmpStack.push(tmpChar);
                }
                // ')' 이면 stack pop
                else if (tmpChar == ')') {
                    if(!tmpStack.isEmpty()) {
                        tmpStack.pop();
                        isVPS = true;
                    } else {
                        isVPS = false;
                        break;
                    }
                }
            }
            if (!tmpStack.empty()) {
                isVPS = false;
            }

            if (isVPS == true) {
                res.append("YES\n");
                //System.out.println("YES");
            } else {
                res.append("NO\n");
                //System.out.println("NO");
            }
            tryCnt--;
        }
        System.out.println(res);
    }
}
