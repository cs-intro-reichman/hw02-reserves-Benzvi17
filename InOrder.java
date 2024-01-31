/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int floor = 0;
		int ceiling = 10;
		int newnumber = (int) (Math.random() *(ceiling - floor) + floor);
		int lastnumber = (int) (Math.random() *(ceiling - floor) + floor);
		System.out.println(lastnumber);

		while (newnumber >= lastnumber) {
			System.out.println(newnumber);
			lastnumber = newnumber;
			newnumber = (int) (Math.random() *(ceiling - floor) + floor);
		}
	}
}