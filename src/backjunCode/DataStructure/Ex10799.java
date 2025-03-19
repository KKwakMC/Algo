package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex10799{
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] t = new int[n];
        for (int i=0; i<n; i++) {
        	t[i] = Integer.parseInt(st.nextToken());
        }

    	for(int i = 0; i < n; i++) {

			while(!stack.isEmpty() && t[stack.peek()] < t[i]) {
				t[stack.pop()] = t[i];
			}
			
			stack.push(i);
		}

		while(!stack.isEmpty()) {
			t[stack.pop()] = -1;
		}
		
    	for(int i = 0; i < n; i++) {
    		bw.write(String.valueOf(t[i]));
    		bw.write(" ");
		}

        br.close();
        bw.flush();
        bw.close();
	}

}