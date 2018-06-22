package Test;

class Genric<T> {
	public static <T> void Display(T[] arr) {
		for(T i:arr){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Integer arr1[]={20,10,42,15,54,4};
		System.out.println("reading  Integer arr objects...");
		Genric.Display(arr1);
		Character arr2[]={'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
		System.out.println( "Printing Character Array" );  
		Genric.Display(arr2); 
	}

}
