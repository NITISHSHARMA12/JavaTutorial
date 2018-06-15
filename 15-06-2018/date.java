/*date*/
class Date{
	int day;
	int month;
	int year;
	Date(){}
	Date(int d, int m, int y){
		day=d;
		month=m;
		year=y;
	}
	public String toString(){
		return day+"-"+month+"-"+year;
	}
}
class Test{
	public static void main(String args[]){
		Date dt=new Date(1,2,2018);
		System.out.println(dt);
	}
}