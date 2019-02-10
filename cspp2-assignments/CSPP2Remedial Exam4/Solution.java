import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		Game game = new Game(count);
		game.addPlayer(new Player(scan.nextLine()));
		int totalScore = 0;
		while (scan.hasNext()) {
			Player p = new Player();
			String lines[] = scan.nextLine().split(" got ");
			if (lines.length == 1) {
				if (game.indexOf(lines[0]) == -1) {
					game.addPlayer(new Player(lines[0]));
				}
			}  else if (lines.length == 2) {
				String player = lines[0];
				int index = game.indexOf(player);
				int score = Integer.parseInt(lines[1]);
				//Please complete the code to complete the game.
				// if (score != 1) {
				// 	totalScore += score;
				// } else {
				// 	totalScore = 0;
				// }
				// System.out.println(totalScore);
				// }
				if (score == 1 ) {
					totalScore = 0;
				} else if (score == 6) {
					totalScore += score;
					totalScore = 0;
				} else {
					totalScore += score;
				}
				game.getp(index).scoreCount(totalScore);
			}
		}
		System.out.println(game.winner());
	}
}
