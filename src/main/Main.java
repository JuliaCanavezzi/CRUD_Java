package main;

import java.util.Scanner;
import dao.ProductDAO;
import entity.Product;
import menu.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			ProductMenu.show();
			int option = in.nextInt();

			switch (option) {
				case 1:
				CreateMenu.show();
					break;

				case 2:
					ListMenu.show();
					break;

				case 3:
				System.out.println("\nExiting...");
					in.close();
					return;

				case 4:
				UpdateMenu.show();
				break;

				case 5:
				DeleteMenu.show();
				break;

				default:
					System.out.println("\nEnter a valid option");
					break;
			}
		}

	}
}
