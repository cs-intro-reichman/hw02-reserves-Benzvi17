import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
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
		double i = generator.nextDouble();
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

		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    

