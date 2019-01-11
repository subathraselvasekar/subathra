import java.util.Scanner;
public class largest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		if(x>=y && x>=z) {
			System.out.println(x);
		}
		else if(y>=x && y>=z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
	}

}
