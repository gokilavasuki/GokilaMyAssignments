package week1.day2;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 9;
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				
				System.out.println("Not a Prime Number");
				 prime = false;
				break;				
				
			}
		}
			if(prime == true)
			{
				System.out.println("Prime Number");
			}
		}
	}


