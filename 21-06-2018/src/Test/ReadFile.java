package Test;
import java.io.*;

public class ReadFile {
	public static void main(String[] args)throws IOException {
		FileInputStream fin=new FileInputStream("myfile2.txt");
		System.out.println("ReadLine");
		int ch;
		while((ch=fin.read())!=-1) {
			System.out.println((char)ch);
			
		}
		fin.close();
	}
}
