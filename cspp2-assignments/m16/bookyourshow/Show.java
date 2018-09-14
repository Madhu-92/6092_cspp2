class Show {
	private String movieName;
	private String dateTime;
	private String[] seats;

	public Show(String m, String dt, String[] s) {
		this.movieName = m;
		this.dateTime = dt;
		this.seats = s;
	}

	public String getMovieName() {
		return this.movieName;
	}

	public String getDateTime() {
		return this.dateTime;
	}

	public String[] getSeats() {
		return this.seats;
	}

	public void setSeat(final int index, final String set) {
    seats[index] = set;
  }

  public String toString() {
    return this.movieName + "," + this.dateTime;
  }

}