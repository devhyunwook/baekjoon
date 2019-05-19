package kakao_coding_test_chatbot;

import java.util.Scanner;

public class problem3 {
    // 첫번째 부터 최대한 9가 아닌 수를 만나면 그수를 9로 만든다
    public static long getLargestNumber(long num) {
        // 첫번째에는 0 이 올수 없다
        // 해당 숫자가 9면 패스
        Long res;
        String tmpNumStr = Long.toString(num);   // 문자열로 변경
        int i;  // 첫번째 index
        for (i = 0; i < tmpNumStr.length(); i++) {
            if (tmpNumStr.charAt(i) == '9') {
                continue;
            } else {
                break;
            }

            //            if (tmpNumStr.charAt(i) == '0' && !isAlreadyZero) {
            //                if (i != 0) {
            //                    break;
            //                }
            //            } else if (tmpNumStr.charAt(i) == '0' && isAlreadyZero) {
            //                break;
            //            } else  if (tmpNumStr.charAt(i) == '9') {
            //                continue;
            //            } else {
            //                break;
            //            }
        }
        tmpNumStr = tmpNumStr.replace(tmpNumStr.charAt(i), '9');
        res = Long.parseLong(tmpNumStr);

        return res;
    }

    public static long getSmallestNumber(long num) {
        Long res;
        String tmpNumStr = Long.toString(num);   // 문자열로 변경

        int i; // 첫번째 index
        for (i = 0; i < tmpNumStr.length(); i++) {
            if (i==0 && tmpNumStr.charAt(i) == '1') { // 첫번째가 1인 경우는 패스
                continue;
            } else if (tmpNumStr.charAt(i) == '9'){
                tmpNumStr = tmpNumStr.replace(tmpNumStr.charAt(i), '1');
                break;
            } else {
                tmpNumStr = tmpNumStr.replace(tmpNumStr.charAt(i), '0');
                break;
            }
        }
        res = Long.parseLong(tmpNumStr);

        return res;
    }

    public static long findRange(long num) {
        long largest = getLargestNumber(num);   // 최고값
        long smallest = getSmallestNumber(num); // 최소값
        return largest - smallest;
    }

    public void scan() {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(findRange(num));
        sc.close();
    }
}
