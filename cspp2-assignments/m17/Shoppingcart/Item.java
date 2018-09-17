class Item {
	private String productName;
	private int quantity;
	private double unitPrice;

	public Item(String pn, int q, double up) {
		this.productName = pn;
		this.quantity = q;
		this.unitPrice = up;
	}
	public Item(String pn, int q) {
		this.productName = pn;
		this.quantity = q;
	}

	public String getProductName() {
		return this.productName;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void decreaseQuantity(int number) {
		this.quantity -= number;
	}
	public String toString(){
		return this.getProductName() + " "+ this.getQuantity()+" "+this.getUnitPrice();
	}
}