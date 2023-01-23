package week1.day2;

public class FibbinocciSeries {

	public static void main(String[] args) {
	 int fnum = 0;
	 int snum = 1;
	 int sum;
	 
	 
	 System.out.print(fnum + "  ");
	 System.out.print(snum + "  ");
	 
	 
	 
	 for (int i = 1; i < 12; i++) {
		 
		 sum = fnum+snum;
		 
		 System.out.print(sum + "  ");
		 
		 fnum = snum;
		 snum = sum;
			 
		
	}

	}

}
