package backjunCode.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex1935 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int suNo = Integer.parseInt(br.readLine());

        String expression = br.readLine();

        double[] values = new double[26];
        for (int i = 0; i < suNo; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                stack.push(values[ch - 'A']);
            } else { // 연산자라면
                double b = stack.pop();
                double a = stack.pop();
                stack.push(cal(ch, a, b));
            }
        }

        // 결과 출력 (소수점 둘째 자리까지 출력)
        bw.write(String.format("%.2f", stack.pop()));
        br.close();
        bw.flush();
        bw.close();
    }

    public static double cal(char ch, double a, double b) {
        switch (ch) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
}