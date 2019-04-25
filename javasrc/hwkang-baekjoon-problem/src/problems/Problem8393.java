package problems;

import java.util.Scanner;

public class Problem8393 {
    public void scan() {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int tmpNum = scanner.nextInt();
            int res = 0;
            for (int i=tmpNum; i>0; i--) {
                res += i;
            }
            System.out.println(res);
        }
    }

}
