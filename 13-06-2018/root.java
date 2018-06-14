/*calculate root of quadric equation */
class Root{
	public static void main(String args[]){
		int a=2,b=3,c=1;
		double x ,y ,root_pos,root_ne,z;
		x=(b*b)-4*a*c;
		y=(-b) + Math.sqrt(x);
		z=(-b) - Math.sqrt(x);
		root_pos=y/(2*a);
		root_ne=z/(2*a);
		System.out.println("root1= "+root_pos);	
		System.out.println("root2= "+root_ne);	
	}
}