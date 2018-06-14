class Mat{
	public static void main(String args[]){
		int[][]arr={{10,20,30},{40,50,60},{70,80,90}};
		int i,j;
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}
}