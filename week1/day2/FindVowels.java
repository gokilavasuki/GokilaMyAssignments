package week1.day2;


public class FindVowels {

	public static void main(String[] args) {
		
		String S = "gokilavarthani";
		
	  
		char C[] = S.toCharArray();
		
		for (int i = 0; i < C.length; i++) {
			
			if (C[i] =='a'||C[i] == 'e'|| C[i] == 'i' || C[i] == 'o' || C[i] == 'u') {
				
				
			System.out.println("Vowels " + C[i] );	
				
		}
			
		}
		

	}

}
