package entity;

public class Product {
 private int id;
 private String sku;
 private String description;
 private float price;
private float maxDiscount;
private int quantity;

public Product(){ }
public Product(String sku, String description, float price, float maxDiscount, int quantity) {
	this.sku = sku;
	this.description = description;
	this.price = price;
	this.maxDiscount = maxDiscount;
	this.quantity = quantity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSku() {
	return sku;
}
public void setSku(String sku) {
	this.sku = sku;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getMaxDiscount() {
	return maxDiscount;
}
public void setMaxDiscount(float maxDiscount) {
	this.maxDiscount = maxDiscount;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
