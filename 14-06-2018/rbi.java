/*Rbi */
abstract class Rbi{
	abstract double callInterest(float principle, float roi, int period);
}
class Sbi extends Rbi{
	public double callInterest(float principle, float roi, int period){
		return ((principle*period*roi)/100);
	}
}
class Hdfc extends Rbi{
	public double callInterest(float principle, float roi, int period){
		return ((principle*period*roi)/100);
	}
}
class Test{
	public static void main(String args[]){
		Rbi dt;
		double result;
		dt =new Sbi();
		result=dt.callInterest(1000.0f,10.0f,12);
		System.out.println("simple interest of SBI =>"+result);
		dt =new Hdfc();
		result=dt.callInterest(4000.0f,20.0f,12);
		System.out.println("simple interest of Hdfc =>"+result);
	}
}