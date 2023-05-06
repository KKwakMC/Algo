package backjun;

import java.io.*;

public class Ex1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S;
		
		int[] a = new int[26];
		
		S = br.readLine();
		
		for(int i=0; i<S.length(); i++) {
			int t = S.charAt(i);
			if(t>=65 && t<=90) {
				a[t-65]++;
			} else {
				a[t-97]++;
			}
		}
		
		char result = '?';
		int b = -1;
		
		for(int i=1;i<26;i++) {
			if(b < a[i]) {
				result = (char)(i + 65);
				b=a[i];
			} else if (b == a[i]){
				result = '?';
			}
		}
		
		System.out.println(result);
		br.close();
	}

}
