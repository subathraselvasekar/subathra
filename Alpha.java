import java.util.Scanner;
public class Alpha {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		if((((int)s.charAt(0)>=65) && ((int)s.charAt(0)<=90)) || (((int)s.charAt(0)>=97) && ((int)s.charAt(0)<=122))) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("invalid");
		}
		
	}

}
