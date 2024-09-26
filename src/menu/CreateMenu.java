package menu;

import java.util.Scanner;
import dao.ProductDAO;
import entity.Product;

public class CreateMenu {
	public static void show () {
		Scanner in = new Scanner(System.in);
		System.out.println("\n Enter the quantity: ");
		int quantity = in.nextInt();
		System.out.println("\n Enter the SKU: ");
		String sku = in.next();
		System.out.println("\n Enter the description: ");
		String description = in.next();
		System.out.println("\n Enter the price: ");
		float price = in.nextFloat();
		System.out.println("\n Enter the max discount: ");
		float maxDiscount = in.nextFloat();
		Product product = new Product(sku, description, price, maxDiscount, quantity);
		ProductDAO.Create(product);

	}
}
