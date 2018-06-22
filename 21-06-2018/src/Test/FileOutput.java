package Test;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class FileOutput {
	public static void main(String[] args)throws IOException {
		DataInputStream dis= new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("myfile2.txt",true);
		BufferedOutputStream bout =new BufferedOutputStream(fout,1024);
		System.out.println("Enter text (@ at the end);");
			char ch;
			 int count=0;
				while ((ch=(char)dis.read())!='@') {
					bout.write(ch);
					count++;
				}
				bout.close();
				System.out.println(count);
	}
}
