package week1.day2;

public class Checkchar {

	public static void main(String[] args) {
		String name = "Gokilavarthani";
		char expected = 'a';
		int count = 0;
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		
		for (int i = 0; i < name.length(); i++) {
			
			if (name.charAt(i) == expected) {
				
				count++;
			
		}

	} System.out.println(count);

}
}