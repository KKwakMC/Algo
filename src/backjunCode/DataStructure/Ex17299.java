package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex17299{
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        int[] seq = new int[n];
        int[] seq_cnt = new int[1000001];
        for (int i=0; i<n; i++) {
        	int s = Integer.parseInt(st.nextToken());
        	seq_cnt[s] = seq_cnt[s] + 1;
        	seq[i] = s;
        }

    	for(int i = 0; i < n; i++) {

			while(!stack.isEmpty() && seq_cnt[seq[stack.peek()]] < seq_cnt[seq[i]]) {
				seq[stack.pop()] = seq[i];
			}
			
			stack.push(i);
		}
        
		while(!stack.isEmpty()) {
			seq[stack.pop()] = -1;
		}
		
    	for(int i = 0; i < n; i++) {
    		bw.write(String.valueOf(seq[i]));
    		bw.write(" ");
		}

        br.close();
        bw.flush();
        bw.close();
	}

}