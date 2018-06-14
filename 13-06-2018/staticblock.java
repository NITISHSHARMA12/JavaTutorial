/*static block*/
class StaticBlock{
	public static void hi(){
		System.out.println("hello2");
	} 
}
class Test{
	public static void main(String args[]){
		System.out.println("hello");
	StaticBlock.hi();
	}
}