import java.util.Scanner;
public class vowel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'||s.charAt(0)=='A'||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)=='U') {
            System.out.println("Vowel");			
		}
		else if((((int)s.charAt(0)>=65) && ((int)s.charAt(0)<=90)) || (((int)s.charAt(0)>=97) && ((int)s.charAt(0)<=122))) {
			System.out.println("Consonent");
		}
		else {
			System.out.println("invalid");
		}
		
	}

}
