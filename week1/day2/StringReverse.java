package week1.day2;

public class StringReverse {

	public static void main(String[] args) {
		String S = "TestLeaf";
		
		char C[] = S.toCharArray();
		
		boolean contains = S.contains("Test");
		
		if (S.contains("Test"))
		{
			System.out.println(contains);
		}
		
		for (int i = 0; i < C.length; i++) {
			
			System.out.print(C[i]);
			
		}
		
		for (int j = C.length-1; j>=0 ; j--) {
			System.out.println(C[j]);
			
		}
		
             String T = S.toUpperCase();
             System.out.println(T);
             
             
             
	}
}
