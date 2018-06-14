/*find Even Number range 1-20*/
class Evens{
	public static void main(String args[]){
		int i,j,sum=0;
		
		for(i=1;i<=20;i++){
			if(i % 2 ==0){
				sum += i;
				
			}				
			
		}
		System.out.println("even number= "+sum);
	}
}