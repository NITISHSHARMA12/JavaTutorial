/*abstract class*/
abstract class NumOperation{
	abstract int operation(int a ,int b);
}
	
class Arithmetic extends NumOperation{
	int sum;
	public int operation(int a,int b){
		sum=a+b;
		return sum;
	}
}
class Logical extends NumOperation{
	public int operation(int a,int b){
		return (a & b);
	}
}
class Test{
	public static void main(String args[]){
		NumOperation obj;
		int result;
		obj=new Arithmetic();
		result=obj.operation(2,6);
		System.out.println("sum of two no. =>"+result);
		
		obj=new Logical();
		result=obj.operation(2,4);
		System.out.println("And Logical op =>"+result);
	}
}

