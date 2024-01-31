
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	//counters of the gender
	int b = 0;
	int g = 0;
	String gender = "";
	while (b==0 || g == 0){
	double i = Math.random();
		if (i > 0.5 ) {
			gender = gender + "g ";
			b++;
		} else {
			gender = gender + "b ";
			g++;
		}
		
	}
	System.out.println(gender);
	System.out.println("You made it... and you now have " + (b + g) + " children" );
	}
}
