package backjun;

import java.util.Scanner;

public class Ex10809 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		char[] std = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		String a = in.next();
		in.close();
		
		String result = "";
		
		int k = -1;
		
		for(int i = 0; i < std.length; i++) {
			k = -1;
			for(int j = 0; j < a.length(); j++) {
				if(std[i] == a.charAt(j)) {
					k = j;
					break;
				} 
			}

			result = result + k + " ";

		}
		
		System.out.print(result);
	}

}
