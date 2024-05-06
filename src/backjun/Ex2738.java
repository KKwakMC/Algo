package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        
        for(int i=0; i<N; i++) {
        	String nstr = bfr.readLine();
        	StringTokenizer nst = new StringTokenizer(nstr, " ");
            for(int j=0; j<M; j++) {
                A[i][j] = Integer.parseInt(nst.nextToken());
            }
        }
        
        for(int i=0; i<N; i++) {
        	String sstr = bfr.readLine();
        	StringTokenizer sst = new StringTokenizer(sstr, " ");
            for(int j=0; j<M; j++) {
                B[i][j] += Integer.parseInt(sst.nextToken());
            }
        }
        
        for(int i=0; i<N; i++) {
        	for(int j=0; j<M; j++) {
        		System.out.print((A[i][j]+B[i][j]) + " ");
        	}
        	System.out.println("");
        }

	}

	
}
