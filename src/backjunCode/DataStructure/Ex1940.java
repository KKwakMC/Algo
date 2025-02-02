package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 주몽의 명령
// 재료의 개수 N(1<N<15,000) 갑옷을 만드는데 필요한 수 M(1<M<10,000,000)
// 고유한 번호는 100,000보다 작거나 같은 자연수

// 정렬하면 문제를 좀 더 쉽게 풀수 있는지 확인 -> 최대 범위가 15,000이므로 O(n)으로 사용

// 투 포인터 이동 원칙


public class Ex1940 {
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N = Integer.parseInt(br.readLine());
    	int M = Integer.parseInt(br.readLine());
    	
    	int[] A = new int[N];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i=0; i<N; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(A);
    	
    	int count = 0;
    	
    	int i = 0;  // Min
    	int j = N-1;   //Max
    	
    	while (i<j) {
    		if(A[i]+A[j]<M) i++;
    		else if(A[i]+A[j]>M) j--;
    		else {
    			count ++;
    			i++;
    			j--;
    		}
    	}
    	
    	System.out.println(count);
    }
}
