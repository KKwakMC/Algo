package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex9012{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			Stack<Integer> stack = new Stack<>();
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			int result = 0;
			
			char stArry[] = s.toCharArray();
			if (stArry[0] != '(') {
				result = -1;
			}else if(stArry[stArry.length - 1] != ')') {
				result = -1;
			} else {
				for(char ch : s.toCharArray()) {
	        		if (ch == '(') {
	        			stack.push(1);
	        		} else {
	        			if (stack.empty()) {
	        				result = -1;
	        				break;
	        			} else {
	        				result = stack.pop();
	        			}
	        		}
	        	}
			}
        	
        	if (result == 1 && stack.empty()) {
        		bw.write("YES");
        	} else {
        		bw.write("NO");
        	}
        	
        	bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}