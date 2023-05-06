package backjun;

import java.io.IOException;
import java.util.Scanner;

public class EX1152 {

	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			int t = str.charAt(i);

			if(i == 0) {
				if(t == 32 && str.length() == 1) {
					count = -1;
				} else {
					continue;
				}
				
			} else if(i == str.length()-1){
				break;
			} else {
				if(t == 32) {
					count++;
				}
			}
			
		}
		
		System.out.println(count+1);
	}

}
