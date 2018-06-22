package Test;

public class GarbageCollection {
	public void finalize(){
		System.out.println("object is garbage collection");
	}
	public static void main(String[] args) {
		GarbageCollection s1= new GarbageCollection();
		GarbageCollection s2=new GarbageCollection();
		s1=s2;
		System.gc();
	}
}
