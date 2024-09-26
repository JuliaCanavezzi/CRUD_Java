package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

	public List<Product> Read () {
		return null;

	}
}
