/*count number of object in class*/
class CountStatic{
	static int count=0;
	CountStatic(){
		count += 1;
	}
	void show(){
		System.out.println("hello");
	}
}

class Test{
	public static void main(String args[]){
	CountStatic s1,s2,s3;
	s1 = new CountStatic();
	s2 = new CountStatic();
	s3 = new CountStatic();
	System.out.println(CountStatic.count);
	System.out.println(s1.count);
	s1.show();
	}
}