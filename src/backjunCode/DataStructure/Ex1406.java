package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex1406{
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Stack<Character> stack = new Stack<>();
        Stack<Character> substack = new Stack<>();
    	for(char ch : st.nextToken().toCharArray()) {
    		stack.push(ch);
    	}
        
        int n = Integer.parseInt(br.readLine()); // 첫 줄에서 n 입력 받음

        for(int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	String key = st.nextToken();

        	if(key.equals("L")) {
        		if(!stack.isEmpty()) {
        			substack.push(stack.pop());
        		}
        		
        	} else if(key.equals("D")){
        		if(!substack.isEmpty()) {
        			stack.push(substack.pop());
        		}
        	} else if(key.equals("B")){
        		if(!stack.isEmpty()) {
        			stack.pop();
        		}
        	} else if(key.equals("P")){
        		stack.push(st.nextToken().charAt(0));
        	}
        }
        
        while (!stack.empty()) {
        	substack.push(stack.pop());
        }

        while (!substack.empty()) {
        	bw.write(substack.pop());
        } 
        
        br.close();
        bw.flush();
        bw.close();
	}

}