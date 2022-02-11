
public class CharOccuranceThreedotOne {  

	   static void charCount(String input_string) 
	   { 
	   	int length = input_string.length(); 

		
		int count_array[] = new int[256]; 


		for (int i = 0; i < length; i++) 
			count_array[input_string.charAt(i)]++; 

		char array[] = new char[input_string.length()]; 
	        for (int i = 0; i < length; i++) { 
		   array[i] = input_string.charAt(i); 
		   int count = 0; 
		   for (int j = 0; j <= i; j++) { 

			if (input_string.charAt(i) == array[j])  
				count++;                 
		   } 

		   if (count == 1)  
		      System.out.println("Occurrence of char " + input_string.charAt(i) + " in the given string is:" + count_array[input_string.charAt(i)]);             
		} 
	   } 
	   public static void main(String[] args) 
	   {  
		String input_string = "DevLabs Alliance Training"; 
		charCount(input_string); 
	   } 
	}