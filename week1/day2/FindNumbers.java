package week1.day2;

public class FindNumbers {

	public static void main(String[] args) {
		String text = "    I want to ignore ABC $123 456 and want to display abc alone   ";
	    String substring = text.substring(2,6);
		String Ignore= text.replaceAll("[A-Za-z]", "");
		String trim = text.trim();
		System.out.println(trim);
		System.out.println(substring);
		System.out.println(Ignore);
	
	}
	

}
