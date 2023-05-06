package backjun;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
            
            int S = Integer.parseInt(st.nextToken());
            String P = st.nextToken();

			for(int j=0; j<P.length(); j++) {
				for(int k = 0; k<S; k++) {
					bw.write(P.charAt(j));
				}
			}
			bw.newLine(); 
		}
		
		bw.flush();
        bw.close();
        br.close();
	}
	

}
