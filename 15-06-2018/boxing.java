/*Boxing and Unboxing.*/
class Test{
	public static void main(String args[]){
		int x=100;
		Integer newX=new Integer(x);   //Boxing
		x=newX.intValue(); //UnBoxing
		
		int y=100;
		Integer newY=y; //AutoBoxing
		y=newY;			//AutounBoxing
		System.out.println("x: "+x);
		System.out.println(newX);
		System.out.println("y "+y);
		System.out.println(newY);
	}
}