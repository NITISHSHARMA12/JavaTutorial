import java.util.Scanner;
class Switch{
	String later =new Scanner(System.in).next();
	void display(){
	switch(later){
		case "A":
		case "a":
		case "E":
		case "e":
		case "I":
		case "i":
		case "O":
		case "o":
		case "U":
		case "u":
		System.out.println("vowel");
		break;
		default:
		System.out.println("constant");
	}
	}
}
class Test{
	public static void main(String args[]){
		Switch st=new Switch();
		st.display();
	}
}