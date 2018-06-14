/*1-100 find prime number*/
class Prime{
	public static void main(String args[]){
		int i,j,n=100;
		
		for(i=1;i<=n;i++){
			int counter=0;
			for(j=1;j<=i;j++){
				if(i % j == 0){
					counter++;
				}
			}
			if(counter == 2){
			System.out.println("prime no= "+i);
			}
		}
		
	}
}