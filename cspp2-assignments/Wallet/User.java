public class User {
	String name;
	Wallet[] wallet;
	int size;
	// User() {
	// 	wallet = new Wallet[5];
	// 	size = 0;
	// }
	User(int num) {
		this.name = name;
		wallet = new Wallet[num];
		size = 0;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addWallet(Wallet obj) {
		for (int i = 0; i < wallet.length; i++) {
			// System.out.println("reached");
			if (wallet[i] == null) {
				// System.out.println("reach");
				// wallet[i].setName(name1);
				wallet[i] = obj;
				size++;
				break;
			}
		}
	}
	public void credit(String name, int amount) {
		Wallet a = new Wallet();
		// int x = 0;
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				a = wallet[i];
				break;
			}
		}
		if (amount > 0) {
			a.amount = a.amount + amount;
		}
		if (amount < 0) {
			System.out.println("Negative amount");
		}

	}
	public void debit(String name, int amount) {
		Wallet b = new Wallet();
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				b = wallet[i];
				break;
			}
		}
		if (b.amount >= amount) {
			b.amount = b.amount - amount;
		}
		else if (b.amount < amount) {
			System.out.println("Insufficient funds");
		}
		else {
			System.out.println("Negative amount");
		}
	}
	public void balance(String name) {
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				System.out.println((float)wallet[i].getAmount());
				break;
			}
		}
	}
	public void transfer(String user1, String user2, int amount) {
		// int x = 0;
		// for (int i = 0; i < size; i++) {
		// 	if (wallet[i].getName().equals(user1)) {
		// 		if (wallet[i].getAmount() < amount) {
		// 			System.out.println("Insufficient funds");
		// 		}
		// 		if (wallet[i].getAmount() < 0) {
		// 			System.out.println("Negative amount");
		// 		}
		// 		x = wallet[i].getAmount() - amount;
		// 		wallet[i].setAmount(x);
		// 		break;
		// 	}
		// }
		// for (int i = 0; i < size; i++) {
		// 	if (wallet[i].getName().equals(user2)) {
		// 		x = wallet[i].getAmount() + amount;
		// 		wallet[i].setAmount(x);
		// 		break;
		// 	}
		// }
		for (int i = 0; i < size; i++) {
			if (wallet[i].name.equals(user1)) {
				if (wallet[i].amount < amount) {
					System.out.println("Insufficient funds");
					break;
				}
				wallet[i].amount = wallet[i].amount - amount;
			}

			if (wallet[i].name.equals(user2)) {
				wallet[i].amount = wallet[i].amount + amount;
			}
		}


	}
}