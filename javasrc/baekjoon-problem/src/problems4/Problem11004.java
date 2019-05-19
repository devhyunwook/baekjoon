package problems4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Count {
    long key;

    Count (long key) {
        this.key = key;
    }
}
public class Problem11004 {
    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //갯수와 몇번째 인지를 입력 받는다
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int totCnt = Integer.parseInt(st.nextToken());
        int search = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        PriorityQueue<Count> pq = new PriorityQueue<>(new Comparator<Count>() {
            @Override public int compare(Count count1, Count count2) {
                if (count1.key > count2.key) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        //
        while (totCnt-->0) {
            Count tmpCount = new Count(Long.parseLong(st.nextToken()));
            pq.add(tmpCount);
        }

        long findCnt = 1;
        while (!pq.isEmpty()) {
            Count resCount = pq.poll();
            if (findCnt == search) {
                System.out.println(resCount.key);
                break;
            }
            findCnt++;
        }
    }
}
