import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n < 0) {
			System.out.println("invalid");
		}
		else if(n%2 == 0) {
			System.out.println("Even");
	

		}
		else {
			System.out.println("Odd");
		}
		                                // TODO Auto-generated method stub

	}

}
