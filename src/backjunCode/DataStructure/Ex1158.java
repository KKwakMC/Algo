package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1158{
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        
        Queue<Integer> inQueue = new LinkedList<>();
        
        for (int i=1; i<=n; i++) {
        	inQueue.add(i);
        }

        bw.write("<");

        int cnt = 1;
        while(!inQueue.isEmpty()) {
        	for (int j=0; j<num; j++) {
        		if (j == num-1) {
        			bw.write(String.valueOf(inQueue.poll())); //Integer에서 String으로 변환해서 넣어야됨
        		} else {
        			inQueue.add(inQueue.poll());
        		}
        	}
        	if (cnt != n) {
        		bw.write(", ");
        		cnt++;
        	}
        }
        bw.write(">");
        
        br.close();
        bw.flush();
        bw.close();
	}

}