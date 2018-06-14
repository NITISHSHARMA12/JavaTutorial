import calc.*;
class Arithmetic{
	public static void main(String args[]){
		int result, result2;
		Calculator cl=new Calculator();
		result=cl.add(2,4);
		result2=cl.sub(3,2);
		System.out.println("sum=> "+result);
		System.out.println("sum=> "+result2);
	}
}