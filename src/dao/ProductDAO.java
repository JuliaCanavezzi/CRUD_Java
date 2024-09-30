package dao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.DatabaseConnection;
import entity.Product;

public class ProductDAO {
	public static void Create (Product product) {
		String sql = "INSERT INTO product (quantity, sku, description, price, max_discount) VALUES (?, ?, ?, ?, ?)";

		try (Connection con = DatabaseConnection.getConnection();
			PreparedStatement stat = con.prepareStatement(sql)){

			stat.setInt(1, product.getQuantity());
			stat.setString(2, product.getSku());
			stat.setString(3, product.getDescription());
			stat.setFloat(4, product.getPrice());
			stat.setFloat(5, product.getMaxDiscount());

			stat.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();

		}

	}

	public static List<Product> List () {
		List<Product> products = new ArrayList<>();
		String sql = "SELECT * FROM product";


		try (
			Connection con = DatabaseConnection.getConnection();
			Statement stat = con.createStatement();
			ResultSet result = stat.executeQuery(sql)
		) {

				while(result.next()) {
					Product product = new Product();
					product.setId(result.getInt("id"));
					product.setQuantity(result.getInt("quantity"));
					product.setDescription(result.getString("description"));
					product.setSku(result.getString("sku"));
					product.setPrice(result.getFloat("price"));
					product.setMaxDiscount(result.getFloat("max_discount"));

					products.add(product);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	public static void Update (Product product){
		String sql = "UPDATE product SET description = ?, sku = ?, max_discount = ?, price = ?, quantity = ? WHERE id = ?";

		try(
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement stat = con.prepareStatement(sql);
		){

			stat.setString(1, product.getDescription());
			stat.setString(2, product.getSku());
			stat.setFloat(3, product.getMaxDiscount());
			stat.setFloat(4, product.getPrice());
			stat.setInt(5, product.getQuantity());
			stat.setInt(6, product.getId());

			stat.executeUpdate();

		} catch(SQLException e) {
				e.printStackTrace();

		}
	}
}




