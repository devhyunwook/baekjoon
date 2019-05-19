package problems4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Problem10825 {

    class Count {
        String name;
        int kor;
        int eng;
        int math;

        Count(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }

    public void scan() throws IOException {
        // 몇줄인지 입력 받는다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCnt = Integer.parseInt(br.readLine());

        PriorityQueue<Count> pq = new PriorityQueue<>(new Comparator<Count>() {
            @Override public int compare(Count count1, Count count2) {
                if (count1.kor > count2.kor) {
                    return -1;
                } else if (count1.kor < count2.kor){
                    return 1;
                } else { // 국어점수가 같은 경우
                    if (count1.eng > count2.eng) {
                        return 1;
                    } else if (count1.eng < count2.eng) {
                        return -1;
                    } else {
                        if (count1.math > count2.math) {
                            return -1;
                        } else if (count1.math < count2.math){
                            return 1;
                        } else {
                            if (count1.name.compareTo(count2.name) > 0) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    }
                }
            }
        });

        while (lineCnt-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Count tmpCount = new Count(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            pq.add(tmpCount);
        }

        while (!pq.isEmpty()) {
            Count resCount = pq.poll();
            System.out.println(resCount.name);
        }
    }
}
