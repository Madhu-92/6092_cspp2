// import java.util.Arrays;
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
	public String winner() {
		int temp = 0;
		for (int i = 0; i < size; i++) {
			if (temp < p[i].getScore() || temp == p[i].getScore()) {
				temp = p[i].getScore();	
				return p[i].getName();
			}
			// if (temp == p[i].getScore()) {
			// 	return p[i].getName();
			// }
			
		}
		// for (int i = 0; i < size; i++) {
		// 	if (temp == p[i].getScore()) {
		// 		return p[i].getName();
		// 	}
		// }
		return null;
		// System.out.println(p[]);
	}
}