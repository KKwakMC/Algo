package backjun;

import java.util.Scanner;

public class Ex2908 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    String[] st = str.split(" ");
	    
	    String result = "";
	    
	    for(int i=0; i<st[0].length(); i++) {
	    	if(st[0].charAt(2) > st[1].charAt(2)) {
	    		result = st[0];
	    	} else if(st[0].charAt(2) < st[1].charAt(2)){
	    		result = st[1];
	    	} else {
	    		if(st[0].charAt(1) > st[1].charAt(1)) {
		    		result = st[0];
		    	} else if(st[0].charAt(1) < st[1].charAt(1)){
		    		result = st[1];
		    	} else {
		    		if(st[0].charAt(0) > st[1].charAt(0)) {
			    		result = st[0];
			    	} else if(st[0].charAt(0) < st[1].charAt(0)){
			    		result = st[1];
			    	} else {
			    		result = st[0];
			    	}
		    	}
	    	}
	    }
	    
	    String reverse = "";
	    for (int i = result.length() - 1; i >= 0; i--) {
	    reverse = reverse + result.charAt(i);
	    }

	    System.out.println(reverse);
	    
	}

}
