import java.io.*;
class HashDemo{
	public static void main(String args[])throws IOException{
		Hashtable<String,Integer> ht=new Hashtable<string,Integer>();
		ht.put("ajay",50);
		ht.put("vikash",20);
		ht.put("vinay",30);
		ht.put("sachin",5);
		System.out.println("The Player Name :-");
		
		Enumeration e=ht.keys();
			while(e.hasMoreElements())
				System.out.println(e.nextElemnet());
		BufferedReader bt=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Player Name :-");
		String name=bt.readLine();
		name=name.trim();
			Integer score=ht.get(name);
			if(score !=null){
				int sc=score.intValue();
				System.out.println(name+ "second" +sc);
			}
			else{
				System.out.println("Player Not Found");
			}
	}
}