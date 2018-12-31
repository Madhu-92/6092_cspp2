public class Screen {
	private String movieName;
	private String[] showtimes;
	private Show[] shows;
	Screen() {
		shows = new Show[5];
		for (int i = 0 ; i < shows.length; i++) {
			shows[i] = new Show();
		}
	}
	public void setMovie(String name) {
		movieName = name;
	}
	public String getMovie() {
		return movieName;
	}
	public Show[] getShows() {
		return shows;
	}
	public void setShowTimes(String[] showtimess) {
		for (int i = 0; i < showtimess.length; i++) {
			shows[i].setShowTime(showtimess[i]);
		}
		// showtimes = showtimes;
	}

}