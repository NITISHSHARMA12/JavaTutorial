/*take 1-10 number and half print sequence and others half reverse*/
class Seqr{
	public static void main(String args[]){
		int[]arr={1,2,3,4,5,6,7,8,9,10};
		int i,l,j=arr.length-1;
		l=(arr.length)/2;
		for(i=0;i<=arr.length-1;i++){
			if(i<l){
				System.out.println("Number"+arr[i]);
			}
			else{
				System.out.println("NumberR"+arr[j]);
				j--;
			}
		}
	}
}
