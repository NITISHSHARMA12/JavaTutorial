/*command line argument*/
class Test{
	public static void main(String args[]){
		/*String fname, lname;
		fname=args[0];
		lname=args[1];
		System.out.println("First name =>"+fname+"last name =>"+lname);
		*/
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("sum : "+(a+b));
	}
}