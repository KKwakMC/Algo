package backjun;

import java.util.Scanner;

public class Schpassword {

	public static void main(String[] args) {


		for (int a=0; a<=9; a++) { 
            for(int b=0; b<=9; b++) {
            	if(a==b) {
    				continue;
    			}
            	for(int c=0; c<=9; c++) {
            		if(a==c || b==c) {
        				continue;
        			}
            		for(int d=0; d<=9; d++) {
            			if(a==d || b==d || c==d) {
            				continue;
            			}
            			for(int e=0; e<=9; e++) {
            				if(a==e || b==e || c==e || d==e) {
            					continue;
            				}
            				for(int f=0; f<=9; f++) {
            					if(a==f || b==f|| c==f || d==f|| e==f) {
            						continue;
            					}
            					for(int g=0; g<=9; g++) {
            						if(a==g||b==g||c==g||d==g||e==g||f==g) {
            							continue;
            						}
            						for(int h=0; h<=9; h++) {
            							if(a==h||b==h||c==h||d==h||e==h||f==h||g==h) {
            								continue;
            							}
            							System.out.println(Integer.toString(a)+Integer.toString(b)+Integer.toString(c)+Integer.toString(d)+Integer.toString(e)+Integer.toString(f)+Integer.toString(g)+Integer.toString(h));
                                	}
                            	}
                        	}
                    	}
                	}
            	}
            }
            
		}	
        	
        
	}

}
