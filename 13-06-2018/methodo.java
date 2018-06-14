class Arithmetic{
	void sum(int x, int y){
		System.out.println(x+y);
	}
	void sum(double x, double y){
		System.out.println(x-y);
	}
}
class Test{
	public static void main(String args[]){
		Arithmetic obj=new Arithmetic();
		obj.sum(10,20);
		obj.sum(10.5,2.0);
	}
}