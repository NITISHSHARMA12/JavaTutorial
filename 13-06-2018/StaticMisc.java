class StaticMisc{
	static int a,b;
	static float c;
	StaticMisc(){
		
	}
	static{
		StaticMisc.a = 2;
		StaticMisc.b = 3;
		System.out.println("Inside static");
	}
	static{
		StaticMisc.c = 5.0f; 
	}
}

class Test{
	public static void main(String args[]){
		System.out.println("Inside main");
		System.out.println(StaticMisc.a);
		System.out.println(StaticMisc.c);
	}
	
	
}