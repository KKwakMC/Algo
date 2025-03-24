package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                stack.pop();
                if (st.charAt(i - 1) == '(') { 
                    count += stack.size();
                } else {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }
}