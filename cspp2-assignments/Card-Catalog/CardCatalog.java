public class CardCatalog {
	int maxnum;
	Card[] card;
	Card cardObj;
	int size;
	// CardCatalog() {
	// 	card = new Card[20];
	// 	size = 0;
	// }
	CardCatalog(int maxnum) {
		this.maxnum = 0;
		card = new Card[20];
		size = 0;
	}


	public int addACard(Card c1) {
		// return c1.toString();
		for (int i = 0; i < card.length; i++) {
			if (card[i] == null) {
				// cardObj = new Card(c1);
				c1.toString();
				card[i] = c1;
				size++;
				return i;
			}
		}
		return -1;
	}
	public int sizeOfCatalog() {
			return size;
	}

	public Card getCardByTitle(String title) {
		for (int i = 0; i < size; i++) {
			if (card[i].getTitle().equals(title)) {
				return card[i];
			}
		}
		return null;
	}
	public void removeCard(String title) {
		for (int i = 0; i < size; i++) {
			if (card[i] != null) {
				if (card[i].getTitle().equals(title)) {
					card[i] = null;
					size--;
				}
			}
		}
	}
	public void clear() {
		// System.out.println("qwert");
		// Card[] card = new Card[0];
		// for (int i = 0; i < size; i++) {
		// 	if (card[i] != null) {
		// 		card[i] = null;
		// 		// if (card[i].getTitle().equals(title)) {
		// 		// 	card[i] = null;
				
		// 		size--;
		// 		}
		// 	}
		size = 0;
		
		
		}

	

	// public Card[] allCards() {
	// 	return card;
	// }
	// public Card addACard(Card c1) {

	// }
}