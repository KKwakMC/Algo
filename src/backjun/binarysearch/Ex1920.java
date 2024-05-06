package backjun.binarysearch;

import java.util.*;
import java.io.*;

/*
 * 아이디어 : 
 *  N개의 숫자를 정렬
 *  M개를 for 돌면서 이진탐색
 *  이진탐색 안에서 마지막에 데이터 찾으면 1출력, 아니면 0출력
 * 
 * 시간복잡도 : 
 *  N개의 입력값 정렬 = O(NlgN)
 *  M개를 N개 중에서 탐색 = O(M*lgN)
 *  총합 : O(N+M)lgN > 가능
 * 
 * 자료구조 :
 *  N개 숫자 int[]
 *  M개 숫자 int[]
 * 
*/


public class Ex1920 {

	    public static void main(String args[]) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;

			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N];
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr); // 오름차순 정렬

			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			while (M-- > 0) {
				int target = Integer.parseInt(st.nextToken());
				System.out.println(binarySearch(arr, target, 0, N - 1));
			}
	    }

		private static int binarySearch(int[] arr, int target, int start, int end) {

			while (start <= end) {
				int mid = (start + end) / 2;
				if (arr[mid] == target) {
					return 1;
				} else if (arr[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

			return 0;
		}
}
