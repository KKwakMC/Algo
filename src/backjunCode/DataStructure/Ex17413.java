package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex17413{
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();
        
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> inQueue = new LinkedList<>();
        
    	for(char ch : st.toString().toCharArray()) {
    		inQueue.add(ch);
    	}

    	while (!inQueue.isEmpty()) {
    		if(String.valueOf(inQueue.peek()).equals("<")) {
    			while (!stack.isEmpty()) {
    				bw.write(stack.pop());
    			}
    			
    			while (!String.valueOf(inQueue.peek()).equals(">")) {
        			bw.write(inQueue.poll());
    			}
    			bw.write(inQueue.poll());
    		} else if (String.valueOf(inQueue.peek()).equals(" ")){
    			while (!stack.isEmpty()) {
    				bw.write(stack.pop());
    			}
    			bw.write(inQueue.poll());
    		} else {
    			stack.push(inQueue.poll());
    		}
    	}
    	
		while (!stack.isEmpty()) {
			bw.write(stack.pop());
		}
        
        br.close();
        bw.flush();
        bw.close();
	}

}