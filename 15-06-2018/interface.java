/*interface*/
interface I{
	void m1();
	default void m2(){}
	static void m3(){}
}
class A implements I{
	public void m1(){}
}
class Test{
	public static void main(String args[]){
		A obj =new A();
		obj.m1();
		obj.m2();
	}
}