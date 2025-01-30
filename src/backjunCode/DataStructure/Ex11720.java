package backjunCode.DataStructure;

import java.util.Scanner;

// 배열 예시

public class Ex11720 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	String sNum = sc.next();
    	
    	char[] cNum = sNum.toCharArray();
    	
    	int sum = 0;
    	
    	for(int i = 0; i<cNum.length; i++) {
    		sum += cNum[i] - 48;
    	}
    	
    	System.out.println(sum);
    }
}
