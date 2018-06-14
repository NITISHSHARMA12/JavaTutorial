/*setter and getter*/
class SetDate{
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day){
		this.day=day;
	}
	public int getDay(){
		return day;
	}
	public void setMonth(){
		
	}
	public void setYear(){}

}
class Test{
	public static void main(String args[]){
		SetDate dt=new SetDate();
		dt.setDay(10);
		System.out.println(dt.day);
	}
	
}