package backjun.backtracking;

import java.util.*;
import java.io.*;

/*
 * 아이디어 : 
 *  백트래킹 재귀함수 안에서 for 돌면서 숫자 선택(이때 방문여부 확인)
 * 	백트래킹 재귀함수에서 M개를 선택한 경우 print
 * 
 * 
 * 시간복잡도 : 
 *  N! => 8 가능
 * 
 * 자료구조 :
 * 	결과값 저장 int[]
 * 	방문여부 체크 bool[]
 * 
 * 
 * 
*/


public class Ex15649 {
		public static int N;	// 정적변수로 변경
		public static int M;	// 정적변수로 변경
		public static int[] arr;
		public static boolean[] visit;
		public static StringBuilder sb = new StringBuilder();
	
	    public static void main(String args[]) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			StringTokenizer st = new StringTokenizer(br.readLine());
	 
			// 정적변수 N과 M을 초기화해준다.
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
	 
			arr = new int[M];
			visit = new boolean[N];
	        
			// 정적변수를 쓰면 되기 때문에 굳이 N과 M을 넘겨줄 필요 없다.
			dfs(0);
			System.out.println(sb);
	    }
	    
		public static void dfs(int depth) {
			if (depth == M) {
				for (int val : arr) {
					sb.append(val).append(' ');
				}
				sb.append('\n');
				return;
			}
	 
			for (int i = 0; i < N; i++) {
				if (!visit[i]) {
					visit[i] = true;
					arr[depth] = i + 1;
					dfs(depth + 1);
					visit[i] = false;
				}
			}
		}


}
