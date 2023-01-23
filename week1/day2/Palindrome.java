package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String S = "MAdam";	
		String R = "";
		char C[] = S.toCharArray();					
		for (int j = C.length-1; j>=0 ; j--) {
			
			R = R + C[j];
				
			}
			if (S.equalsIgnoreCase(R))
			{
				System.out.println( "It is a palindrome");
			} else
			{
				System.out.println( "Not a Palindrome");
			}
			
			
		}  
		
		
             
	}

