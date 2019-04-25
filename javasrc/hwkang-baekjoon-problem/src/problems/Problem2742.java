package problems;

import java.util.Scanner;

public class Problem2742 {

    public void scan2742 () {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int tmpNum = scanner.nextInt();

            for (int i=tmpNum; i>0; i--){
                System.out.println(i);
            }
        }
    }
}
