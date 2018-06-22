package product;

public class Product {
	int id;
	String name;
	double price;
	public Product(int id,String name, double price ) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void Display(){
		System.out.println("product id  Product Name   Product Price");
		System.out.println(id+"\t"+name+"\t"+price);
		
	}
}
