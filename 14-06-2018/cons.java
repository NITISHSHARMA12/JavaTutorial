/*constructor*/
class SetDate{
	private int day;
	private int month;
	private int year;
		SetDate(){}
		SetDate(int day,int month,int year){
			this.day=day;
			this.month=month;
			this.year=year;

		}
		public int getDay(){
			return day;
		}
		public int getMonth(){
			return month;
		}
		public String getDate(){
			String s = "";
			s = day+"/"+month+"/"+year;
			return s;
		}

}
class Test{
	public static void main(String args[]){
		SetDate dt=new SetDate(10,2,2018);
		System.out.println(dt.getDate());
	}

}