public class Wallet {
	String name;
	int amount = 1000;
	// User[] user;
	Wallet() {
		this.amount = 1000;
	}
	Wallet(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getAmount() {
		return this.amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String toString() {
		return this.name+" "+this.amount;
	}

	// public void credit(String name, int amount) {

	// }
	// public void debit(String name, int amount) {

	// }
	// public int availBalance() {

	// }
	// public void transfer(String user1, String user2, int amount) {

	// }
}