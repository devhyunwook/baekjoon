package problems4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem2751 {
    public void scan() throws IOException {
        // 수 정렬하기 2
        // N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 총 갯수
        int totNum = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0; i<totNum; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(nums);
        for (int i=0; i<nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
}
