public class Game {
	int count;
	Player[] p;
	int size;
	Player person = new Player();
	Game(int count) {
		this.count = count;
		p = new Player[count];
		size = 0;
	}
	Game() {
		p = new Player[count];
		size = 0;
	}
	public void addPlayer(Player obj) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null) {
				p[i] = obj;
				size++;
				break;
			}
		}
	}
	public Player getp(int index) {
		return p[index];
	}
	public int indexOf(String name) {
		for (int i = 0; i < size; i++) {
			if (p[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public void winner() {
		int max = p[0].getScore();
		for (int i = 0; i < size; i++) {
			// if (p[i].getScore() >= 200) {
			// 	// System.out.println(p[i].getScore());
			// 	System.out.println(p[i].getName());
			// 	break;
			// 	// return p[i].getName();
			// }
			if (p[i].getScore() > max) {
				max = p[i].getScore();
				System.out.println(p[i].getName());
				break;
			}
		}
		// return null;
	}
}