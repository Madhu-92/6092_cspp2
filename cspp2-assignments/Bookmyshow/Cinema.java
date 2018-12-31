public class Cinema {
	private Screen[] screen;
	private int count;
	private int row;
	private int column;
	Cinema() {
		screen = new Screen[5];
		for (int i = 0; i < screen.length; i++) {
			screen[i] = new Screen();
		}
	}
	Cinema(int count, int row, int column) {
		this.count  = count;
		this.row = row;
		this.column = column;
	}
	public  Screen[] getAllScreens() {
		return screen;
	}
}