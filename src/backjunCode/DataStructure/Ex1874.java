package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex1874{
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder output = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()); // 첫 줄에서 n 입력 받음

        Stack<Integer> stack = new Stack<>(); 
        Queue<Integer> inQueue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(br.readLine());
            inQueue.add(in);
        }

        int num = 1;
        boolean isPossible = true;

        while (!inQueue.isEmpty()) {
            int target = inQueue.poll();

            while (num <= target) {
                stack.push(num++);
                output.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                output.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            bw.write(output.toString());
        } else {
            bw.write("NO\n");
        }

        br.close();
        bw.flush();
        bw.close();
	}

}