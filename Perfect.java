/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		String per = number + " is a perfect number since " + number + " = 1";
		int sum_of_div = 1;
		for (int i = 2; i < number ; i++) {
			if( number % i == 0 ){
				per = per + " + " + i ;	
				sum_of_div += i ;
			}
			
		}
		if (sum_of_div == number) {
			System.out.println(per);
		
		}
		else {
			System.out.println(number + " is not a perfect number");
		}
	}	
}