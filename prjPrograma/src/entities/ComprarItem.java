package entities;
import entities.Produto;

public class ComprarItem {

	private int quantity;
	private double price;
	private Produto product;
	
	public ComprarItem(int quantity, double price, Produto product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Produto getProduct() {
		return product;
	}

	public void setProduct(Produto product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return "" + quantity + ", preço: " + price + ", produto: " + product + "";
	}
	
}
