package problems5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem1260 {
    static int nodeCnt;
    static LinkedList<Integer>[] linkedList;

    public static void dfs(int startNode, boolean[] bfsVisited, StringBuilder bfsString) {
        if (bfsVisited[startNode] == true) {
            return;
        }
        bfsVisited[startNode] = true;
        bfsString.append(startNode + " ");
        for (int nextNode: linkedList[startNode]) {
            bfs(nextNode, bfsVisited, bfsString);
        }
    }

    public static void bfs(int node, boolean[] visited, StringBuilder sb) {
        Queue<Integer> tmpQueue = new LinkedList<>();

        tmpQueue.add(node);

        while (!tmpQueue.isEmpty()) {
            node  = tmpQueue.poll();
            if (visited[node] == true) {
                continue;
            }
            visited[node] = true;
            sb.append(node + " ");
            for (int nextNode: linkedList[node]) {
                tmpQueue.add(nextNode);
            }
        }
    }

    public void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        nodeCnt = Integer.parseInt(st.nextToken());
        int lineCnt = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        linkedList = new LinkedList[nodeCnt+1];
        for (int i=0; i<=nodeCnt; i++) {
            linkedList[i] = new LinkedList<>();
        }

        for (int i=0; i<lineCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int sNode = Integer.parseInt(st.nextToken());
            int eNode = Integer.parseInt(st.nextToken());

            linkedList[sNode].add(eNode);   // 시작끝
            linkedList[eNode].add(sNode);   // 끝시작 모두 등록

            Collections.sort(linkedList[sNode]);
            Collections.sort(linkedList[eNode]);
        }
        StringBuilder dfsString = new StringBuilder();
        StringBuilder bfsString = new StringBuilder();

        boolean[] dfsVisited = new boolean[nodeCnt+1];
        boolean[] bfsVisited = new boolean[nodeCnt+1];

        dfs(startNode, dfsVisited, dfsString);
        bfs(startNode, bfsVisited, bfsString);
        System.out.println(dfsString);
        System.out.println(bfsString);
    }
}
