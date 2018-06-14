/* Create a class Date with fields day and months its all integer and methods initDate to assign the value to field and prints*/
class Date{
	
	int day,month,years;
	
	public void initDate(int day,int month,int years){
		this.day=day;
		this.month=month;
		this.years=years;
		display();
	}
	public void display(){
		System.out.println(day+"-"+month+"-"+years);
	}
	
	
}
class Test{
	public static void main(String args[]){
		Date dt=new Date();
		dt.initDate(9,9,2018);
	}
}