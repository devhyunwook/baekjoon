package problems5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Problem10451 {
    static int nodeCnt;
    static LinkedList<Integer>[] linkedLists;
    static boolean isChecked[];

    static void dfs(int startNode){
        if (isChecked[startNode] == true) {
            return;
        }
        isChecked[startNode] = true;

        for (int nextNode : linkedLists[startNode]) {
            dfs(nextNode);
        }
    }

    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 총문제수
        int examCnt = Integer.parseInt(br.readLine());

        while (examCnt-->0) {
            // 총 순열의 갯수
            int totCnt = Integer.parseInt(br.readLine());
            int totRes = 0;

            isChecked = new boolean[totCnt+1];
            linkedLists = new LinkedList[totCnt+1];
            for (int i=0; i<=totCnt; i++) {
                linkedLists[i] = new LinkedList<>();
            }

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i=1; i<=totCnt; i++) {
                linkedLists[i].add(Integer.parseInt(st.nextToken()));
            }

            for (int i=1; i<=totCnt; i++) {
                if (isChecked[i] == false) {
                    dfs(i);
                    totRes++;
                }
            }
            System.out.println(totRes);
        }
    }
}
