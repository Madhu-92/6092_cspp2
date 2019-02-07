public class Player {
	String name;
	int score;
	Player(String name) {
		this.name = name;
		this.score = score;
	}
	Player() {

	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void scoreCount(int score) {
		this.score += score;
	}
}