package problems2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11655 {
    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //ROT13
        //1.문자입력 받고
        //2.A~M은 +13을
        //3.N~Z은 -13을
        //4.숫자는 그대로 둔다
        StringBuilder resString = new StringBuilder();
        String tmp = br.readLine();
        for (int i=0; i<tmp.length(); i++) {
            char tmpChar = tmp.charAt(i);
            if (tmpChar >= 'a' && tmpChar <= 'm') {
                resString.append(tmpChar+=13);
            } else if (tmpChar >= 'A' && tmpChar <= 'M') {
                resString.append(tmpChar+=13);
            } else if (tmpChar >= 'n' && tmpChar <= 'z') {
                resString.append(tmpChar-=13);
            } else if (tmpChar >= 'N' && tmpChar <= 'Z') {
                resString.append(tmpChar-=13);
            } else {
                resString.append(tmpChar);
            }
        }
        System.out.println(resString);
    }
}
