package problems4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Member {
    int uid;
    int age;
    String name;

    Member(int uid, int age, String name) {
        this.uid = uid;
        this.age = age;
        this.name = name;
    }
}
public class Problem10814 {
    public Problem10814() throws IOException {
    }

    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Member> pq = new PriorityQueue<>(100000, new Comparator<Member>() {
            @Override public int compare(Member m1, Member m2) {
                if (m1.age < m2.age) {
                    return -1;
                } else if (m1.age > m2.age) {
                    return 1;
                } else {
                    return m1.uid - m2.uid;
                }
            }
        });

        // 총사람 수 입력
        int totMemCnt = Integer.parseInt(br.readLine());

        for (int i=0; i<totMemCnt; i++) {
            // 정보 입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            pq.add(new Member(i, Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        while (!pq.isEmpty()) {
            Member tmpMem = pq.poll();
            System.out.println(tmpMem.age + " " + tmpMem.name);
        }
    }
}
