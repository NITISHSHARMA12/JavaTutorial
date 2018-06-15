class Employee implements Cloneable{
	private int eid;
	private String ename;
	Employee(){}
	Employee(int eid, String ename){
		this.eid=eid;
		this.ename=ename;
	}
	void showEmployeeDetails(){
		System.out.println(eid+ " " +ename);
	}
	public Employee clone() throws CloneNotSupportedException{
		Employee emp=new Employee(this.eid,this.ename);
		return emp;
	}
}
class Test{
	public static void main(String args[]) throws Exception{
		Employee e1=new Employee(100,"nitish");
		Employee e2=e1.clone();
		e1.showEmployeeDetails();
		e2.showEmployeeDetails();
	}
}