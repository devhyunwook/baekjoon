package problems;

import java.util.Scanner;

public class Problem2739 {

    public void scan() {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int tmpNum = scanner.nextInt();

            for (int i=1; i<10; i++) {
                System.out.println(tmpNum + " * " + i + " = " + (tmpNum*i));
            }
        }
    }
}
