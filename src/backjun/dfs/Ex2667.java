package backjun.dfs;

import java.util.*;
import java.io.*;

/*
 * 아이디어 : 
 * 	2중 for => 값1 && 방문X => DFS
 * 	DFS를 통해 찾은 값을 저장후 정렬해서 출력
 * 
 * 
 * 시간복잡도 : 
 * 	DFS : O(V+E)
 *  V, E : N^2, 4N^2
 *  V+E : 5N^2 ~= N^2 = 625 < 2억 => 가능
 * 
 * 
 * 
 * 자료구조 :
 * 그래프 전체 지도 : int[][]
 * 방문여부 : bool[][]
 * 결과값 : int[]
 * 
 * 
 * 
*/


public class Ex2667 {
	static int arr[][];
	static boolean visit[][];
	static int dirX[] = {0, 0, -1, 1};
	static int dirY[] = {-1, 1, 0, 0};

	static int count = 0, number = 0;
	static int nowX, nowY, N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N][N];

		for(int i=0; i<N; i++) {
			String str = br.readLine();

			for(int j=0; j<N; j++) {				
				arr[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {

				if(visit[i][j] == false && arr[i][j] == 1) {
					count = 0;
					number++;
					DFS(i, j);	
					list.add(count);
				}

			}
		}

		Collections.sort(list);
		System.out.println(number);
		for(int num : list) {
			System.out.println(num);
		}
	} // End of main

	static void DFS(int x, int y) {
		visit[x][y] = true;
		arr[x][y] = number;
		count ++;

		for(int i=0; i<4; i++) {
			nowX = dirX[i] + x;
			nowY = dirY[i] + y;

			if(Range_check() && visit[nowX][nowY] == false && arr[nowX][nowY] == 1) {
				visit[nowX][nowY] = true;
				arr[nowX][nowY] = number;

				DFS(nowX, nowY);
			}
		}		

	} // End of DFS

	static boolean Range_check() {
		return (nowX >= 0 && nowX < N && nowY >= 0 && nowY < N);
	} // End of Range_check


}
