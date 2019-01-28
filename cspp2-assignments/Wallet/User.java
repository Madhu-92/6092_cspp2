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
	public void setName(String name){
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
		int x = 0;
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				if (wallet[i].getAmount() < 0) {
					System.out.println("Negative amount");
				}
				x = wallet[i].getAmount() + amount;
				wallet[i].setAmount(x);
				// System.out.println(wallet[i].getAmount());
				break;
			}
		}
	}
	public void debit(String name, int amount) {
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				if (wallet[i].getAmount() < amount) {
					System.out.println("Insufficient funds");
				}
				if (wallet[i].getAmount() < 0) {
					System.out.println("Negative amount");
				}

			}
		}
		int x = 0;
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				x = wallet[i].getAmount() - amount;
				wallet[i].setAmount(x);
				break;
			}
		}
	}
	public void balance(String name) {
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				System.out.println(wallet[i].getAmount());
				break;
			}
		}
	}
	public void transfer(String user1, String user2, int amount) {
		int x = 0;
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(user1)) {
				if (wallet[i].getAmount() < amount) {
					System.out.println("Insufficient funds");
				}
				if (wallet[i].getAmount() < 0) {
					System.out.println("Negative amount");
				}
				x = wallet[i].getAmount() - amount;
				wallet[i].setAmount(x);
				break;
			}
		}
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(user2)) {
				x = wallet[i].getAmount() + amount;
				wallet[i].setAmount(x);
				break;
			}
		}

	}
}