package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex9093{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
            	String s = st.nextToken();

        		Stack<Character> stack = new Stack<>();
            	for(char ch : s.toCharArray()) {
            		stack.push(ch);
            	}
            	
            	while(!stack.empty()) {
            		bw.write(stack.pop());
            	}
            	bw.write(' ');
            }
        	
        	bw.write('\n');
        }
        br.close();
        bw.flush();
        bw.close();
	}

}