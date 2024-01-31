/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String rev = "";
		for (int i = (s.length() - 1) ; i >= 0; i--){
			rev += s.charAt(i);
			System.out.print(s.charAt(i));
		}
			System.out.println("");
	
			int N = s.length() -1 ;
			int mid =((N / 2)) ;
			System.out.println("The middle character is " + s.charAt(mid) );     
		
	}
}
