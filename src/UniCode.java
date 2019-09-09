
import java.text.ParseException;

import java.util.Arrays;

import java.util.Scanner;

public class UniCode {

	 public static void main(String args[]) throws ParseException {
	    	Scanner scan = new Scanner(System.in);
	    	
	    	String inputOne;
	    	String inputTwo;
	    	String absMath;
	    	String absMathTwo;
	    	String text;
	    	char userQuest;
	    	int absDif;
	    	
	    	System.out.println("The Following are examples of ASCII conversion.");
	    	 
	        char A = 'A';
	        int ascii = A;
	        System.out.println("ASCII value of 'A' is  : " + ascii);
	        
	        char a = 'a';
	        int value = (int) a;
	        System.out.println("ASCII value of 'a' is  : " + value);
	        
	        
	        userQuest = 'y';
			
			
			while (userQuest == 'y') {
	        
	        System.out.println("Please enter any word to see the ASCII value.");   
	       
	        inputOne = scan.next();
	        
	        try {
	            text = inputOne;

	               byte[] bytes = text.getBytes("US-ASCII");
	            
	            System.out.println("ASCII value of " + text + " is following");
	           
	            absMath = Arrays.toString(bytes);
	            
	            
	            System.out.println(absMath);
	            
	            int sumOne = 0; 
	            int i; 
	           
	            for (i = 0; i < bytes.length; i++) 
	               sumOne +=  bytes[i]; 
	                    
	            System.out.println("The sum of the all the ASCII values is: " +sumOne);
	            
	            
	            System.out.println("Please enter another word to see the ASCII value and absolute difference between word one and word two.");   
	        
	            inputTwo = scan.next();
	            
	            String textTwo = inputTwo;

	            byte[] bytesTwo = textTwo.getBytes("US-ASCII");
	            
	            System.out.println("ASCII value of " + textTwo + " is following");
	           
	            absMathTwo = Arrays.toString(bytesTwo);            
	            
	            System.out.println(absMathTwo);
	            
	            int sumTwo = 0; 
	            int x; 
	           
	            for (x = 0; x < bytesTwo.length; x++) 
	               sumTwo +=  bytesTwo[x]; 
	            
	            System.out.println("The sum of the all the ASCII values is: " +sumTwo);
	            
	            absDif = Math.abs((sumTwo - sumOne));
	            
	            System.out.println("The absolute difference between value One and value Two is: " +absDif);
	            
	            System.out.println("If your interested in seeing more conversion input y to continue, otherwise any key will terminate this: ");
				 
		        userQuest = scan.next().charAt(0); 
		       
	        }catch (java.io.UnsupportedEncodingException e) {
	            e.printStackTrace();
		               }   
										                  
	            }       
	     System.out.println("Thank you very much for viewing this app. Have a great day!");
	      }

	}
