package kakao_coding_test_chatbot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class problem1 {

    public void scan() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int rotateCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> rotate = IntStream.range(0, rotateCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        for (int i=0; i<rotate.size(); i++) {
            int tmpRotate = rotate.get(i);
            Collections.rotate(a, tmpRotate);

            int testMax = Collections.max(a); // Queue -> List
            int findIndex = a.indexOf(testMax);
            System.out.println(findIndex);
        }

        bufferedReader.close();
    }
}
