class ShoppingCart {
	List<Item> catalogue;
	List<Item> cart;
	double totalAmount;
	double payableAmount;
	double discountAmount;
	double tax;
	int disc;

	public ShoppingCart() {
		catalogue = new List<Item>();
		cart = new List<Item>();
		totalAmount = 0.0;
		payableAmount = 0.0;
		discountAmount = 0.0;
		tax = 0.0;
		disc = 0;
	}

	public void addToCatalogue(Item item) {
		catalogue.add(item);
	}

	public void addToCart(Item item) {
		for(int i=0; i < catalogue.size(); i++) {
			if(catalogue.get(i).getProductName().equals(item.getProductName())) {
				if(catalogue.get(i).getQuantity() >= item.getQuantity()) {
					cart.add(item);
					catalogue.get(i).decreaseQuantity(item.getQuantity());
					return;
				}
			}
		}
	}

	public void removeFromCart(Item item) {
		for(int i = 0; i < cart.size(); i++){
			if(cart.get(i).getProductName().equals(item.getProductName())) {
				if( cart.get(i).getQuantity() == item.getQuantity()) {
					cart.remove(i);
				}
				else {
					cart.get(i).decreaseQuantity(item.getQuantity());
				}
			}
		}
	}

	public void showCart() {
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i).getProductName() + " " +
			                   cart.get(i).getQuantity());
		}
	}

	public void showCatalogue() {
		for (int i = 0; i < catalogue.size(); i++) {
			System.out.println(catalogue.get(i).getProductName() + " " +
			                   catalogue.get(i).getQuantity() + " " +
			                   catalogue.get(i).getUnitPrice());
		}
	}

	public double getTotalAmount() {
		totalAmount = 0.0;
		for (int i = 0; i < cart.size(); i++) {
			for (int j = 0; j < catalogue.size(); j++) {
				if (cart.get(i).getProductName().equals(catalogue.get(i).getProductName())) {
					totalAmount += cart.get(i).getQuantity() * catalogue.get(j).getUnitPrice();
				}
			}
		}
		return totalAmount;
	}

	public double getDiscount() {
		discountAmount = (disc * getTotalAmount()) / 100;
		return discountAmount;
	}

	public double getTax() {
		// tax
		// totalAmount *= 15 / 100;
		return totalAmount * 0.15;
	}

	public double getPayableAmount() {
		payableAmount = 0.0;
		payableAmount = getTotalAmount() + getTax();
		return payableAmount;
	}

	public void applyCoupon(String couponCode) {
		if (couponCode.equals("IND10")) {
			disc = 10;
		} else if (couponCode.equals("IND20")) {
			disc = 20;
		} else if (couponCode.equals("IND30")) {
			disc = 30;
		} else if (couponCode.equals("IND50")) {
			disc = 50;
		} else {
			System.out.println("Invalid coupon");
		}
	}

	public void printInvoice(){
		System.out.println("Name quantity Price");
		for(int i=0; i <cart.size(); i++){
			System.out.println(cart.get(i));
		}
		System.out.println("Total:"+getTotalAmount());
		System.out.println("Disc%:"+(getTotalAmount()-getDiscount()));
		System.out.println("Tax:"+getTax());
		System.out.println("Payable Amount: " + getPayableAmount());
	}
}