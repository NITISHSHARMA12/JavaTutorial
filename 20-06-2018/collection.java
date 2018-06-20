import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id , String name, String author, String publisher ,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
}
class Shop{
	public static void main(String args[]){
		List<Book> list=new ArrayList<Book>();
		Book b1= new Book(100,"lets c","Yashwant","BPB",8);
		Book b2= new Book(101,"java","E-blagoswamin","BPB",2);
		Book b3= new Book(102,"Data Communication","forouzen","BPB",55);
		Book b4= new Book(103,"lets java","Yashwant","BPB",6);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		System.out.println("Book Id   Book Name   Book Publisher   Book QUantity");
		System.out.println(".......................................................");
		for(Book b:list){
			System.out.println(b.id+"\t"+b.author+"\t"+b.publisher+"\t \t"+b.quantity);
		}
	}
}