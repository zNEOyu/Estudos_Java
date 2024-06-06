package estudos9en;

public class Product1 {
	private String name;
	private double price;
	private int quantity;
	private double TotalValueInStock() {
		
		return price * quantity;
	}
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name + ", $ " + String.format("%2f", price) + ", " + quantity + " units, Total: $" + String.format("%2f", TotalValueInStock());
	}
	public void setName(String name) {
		this.name = name;
	}
}
