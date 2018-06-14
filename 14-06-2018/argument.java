/*variable size of arugument*/
class VariableSizeArgument{
	void showListItems(String n,int x, int...param){
		
		for(int  i:param){
			System.out.println(i);
		}

	}
}
class Test{
	public static void main(String args[]){
		VariableSizeArgument dt =new VariableSizeArgument();
		dt.showListItems("hello",100,200,201);
	}
}