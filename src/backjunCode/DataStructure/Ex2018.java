package backjunCode.DataStructure;

import java.util.Scanner;

// 연속된 자연수의 합구하기 예시

// N의 최댓값은 10,000,000 매우 크게 잡혀 있음.
// -> O(n)의 시간 복잡도 알고리즘을 사용해야 합니다.

// 투 포인터 이동 원칙
// sum > N : sum = sum _start_index; start_indes++;
// sum < N : end_index++; sum = sum + end_index;
// sum == N : end_index++; sum = sum + end_index; count++;


public class Ex2018 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int count=1;
    	int start_index=1;
    	int end_index=1;
    	int sum=1;
    	
    	while(end_index!=N) {
    		if(sum==N) {
    			count++; end_index++; sum = sum + end_index;
    		}else if(sum>N){
    			sum = sum - start_index;
    			start_index++;
    		}else {
    			end_index++; sum = sum + end_index;
    		}
    	}

    	System.out.println(count);
    }
}
