/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	int T = Integer.parseInt(args[0]);
	int b = 0 ;
	int g = 0;
	int family_of_two = 0;
	int family_of_three = 0;
	int family_of_four_more = 0;
	int num_of_kids = 0;
	for(int t = 0; t <= T; t++){
		 b = 0;
		 g = 0;
		while (b==0 || g == 0){
		double i = Math.random();
			if (i > 0.5 ) {
				b++;
			} else {
				g++;
			}
			
		}
		if ( b + g == 2 ) {
			family_of_two++; 
		}
		else if ( b + g == 3) {
			family_of_three++;
		}
		else {
			family_of_four_more++;
		}
		num_of_kids += (b + g) ;

		}
		System.out.println("Average:" + ( (double) (num_of_kids)/(T))+ " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + family_of_two);
		System.out.println("Number of families with 3 children: " + family_of_three);
		System.out.println("Number of families with 4 or more children: " + family_of_four_more);

		int most_com = Math.max(Math.max(family_of_four_more, family_of_three), family_of_two);
		if (family_of_two > family_of_three && family_of_two > family_of_four_more) {
			most_com = 2;
		}
		else if (family_of_three > family_of_two && family_of_three > family_of_four_more) {
			most_com = 3;
		} else {
			most_com = 4;
		}
		System.out.println("The most common number of children is " + most_com);
	}
	}
