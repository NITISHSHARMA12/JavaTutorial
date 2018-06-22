package product;
import java.io.*;
import java.util.ArrayList;

public class FilterProduct {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee list = ");
		int n;
		n=Integer.parseInt(br.readLine());
		int id,price;
		String name;
		ArrayList<Product> arr=new ArrayList<Product>();
		for(int i=1;i<=n;i++){
			System.out.print("Enter Product_Id : ");
			id=Integer.parseInt(br.readLine());
			System.out.print("Enter Product Name : ");
			name=br.readLine();
			System.out.print("Enter Product Price : ");
			price=Integer.parseInt(br.readLine());
			
			Product pr=new Product(id, name, price);
			arr.add(pr);
		}
		System.out.println("Search Product_Price : ");
//		price=Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			Product pr=arr.get(i);
			if (pr.price<3000) {
				pr.Display();
			}
		}
		
	}
}
