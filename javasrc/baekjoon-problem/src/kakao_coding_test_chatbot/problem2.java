package kakao_coding_test_chatbot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class problem2 {
    public static List<Integer> reassignedPriorities(List<Integer> issuePriorities) {
        // Write your code here

        List<Integer> resArray = new ArrayList<>();
        // 1.List에서 중복되지 않은 값을 빼내기
        Set<Integer> tmpSet = new HashSet<>();
        for (int nextInt: issuePriorities) {
            if (!tmpSet.contains(nextInt)) {
                tmpSet.add(nextInt);
            }
        }
        List<Integer> tmpNum = new ArrayList<>(tmpSet);
        for (int i=0; i<issuePriorities.size(); i++) {
            resArray.add(tmpNum.indexOf(issuePriorities.get(i))+1);
        }

        return resArray;
    }

    public void scan() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int issuePrioritiesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> issuePriorities = IntStream.range(0, issuePrioritiesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = reassignedPriorities(issuePriorities);
        System.out.println(result);

        bufferedReader.close();
    }
}
