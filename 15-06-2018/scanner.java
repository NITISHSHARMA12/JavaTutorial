/*Scanner */
import java.util.Scanner;
class Scan{
	public static void main(String args[]){
		String fname, lname;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your fname");
		fname=sc.next();
		System.out.println("Enter your lname");
		lname=sc.next();
		System.out.println("your full name " +fname+lname);
		
	}
}