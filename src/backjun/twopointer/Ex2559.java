package backjun.twopointer;

import java.util.*;
import java.io.*;

/*
 * 아이디어 : 
 *  투포인터 활용
 *  for 문으로 처음에 K개값을 저장
 *  다음 인덱스 더해주고 이전 인덱스 빼줌
 *  이때마다 최대값을 갱신
 * 
 * 
 * 시간복잡도 : 
 *  O(N) = 1e5 > 가능
 * 
 * 자료구조 :
 *  각 숫자들 N개 저장 배열 : int[]
 *   숫자들 최대 100 > int가능
 *  K개의 값을 저장 변수 : int
 *   최대 : ㅏ * 100 = 1e5 * 100 = 1e7 > INT 가능
 *  최대값 : int
 *  
*/


public class Ex2559 {
	
		public static int getSumOfMaxTmpForKDays(int n, int k, int[] nums) {
			int sum = 0;
			//0~ k-1 까지의 합
			for(int i=0;i<k;i++) {
				sum+=nums[i];
			}
			int max = sum; //최대값으로 지정
			//k~끝까지 탐색
			for(int i=k;i<n;i++) {
				//i번째 숫자 더하기
				sum+=nums[i];
				//i-k번째 숫자 빼기
				sum-=nums[i-k];
				//최대값을 max로 취함
				max=Math.max(max, sum);
			}
			//최대값 출력
			return max;
		}
	
	
	    public static void main(String args[]) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()); //날짜수
			int k=Integer.parseInt(st.nextToken()); //연속되는 수
			
			st=new StringTokenizer(br.readLine());
			//온도 데이터 입력
			int[] nums = new int[n];
			for(int i=0;i<n;i++) {
				nums[i]=Integer.parseInt(st.nextToken());
			}
			//최대 연속 온도 합 출력
			System.out.println(getSumOfMaxTmpForKDays(n, k, nums));
			br.close();
	    }


}
