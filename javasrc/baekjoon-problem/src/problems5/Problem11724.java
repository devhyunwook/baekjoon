package problems5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Problem11724 {
    // dfs (재귀사용)
    // bfs (큐사용)
    static int nodeCnt;
    static LinkedList<Integer>[] linkedLists;
    static boolean[] isChecked;

    public static void dfs(int startNode) {
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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 정점, 간선
        nodeCnt = Integer.parseInt(st.nextToken());
        int lineCnt = Integer.parseInt(st.nextToken());

        linkedLists = new LinkedList[nodeCnt+1];
        for (int i=0; i<=nodeCnt; i++) {
            linkedLists[i] = new LinkedList<>();
        }

        for (int i=0; i<lineCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int sNode = Integer.parseInt(st.nextToken());
            int eNode = Integer.parseInt(st.nextToken());

            linkedLists[sNode].add(eNode);
            linkedLists[eNode].add(sNode);

            Collections.sort(linkedLists[sNode]);
            Collections.sort(linkedLists[eNode]);
        }

        isChecked = new boolean[nodeCnt+1];
        int resCnt = 0;
        for (int i=1; i<=nodeCnt; i++) {
            if (isChecked[i] == false) {
                dfs(i);
                resCnt++;
            }
        }
        System.out.println(resCnt);}
}
