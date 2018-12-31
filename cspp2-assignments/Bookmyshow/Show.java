public class Show {
	String showTime;
	String[] booking;
	int availableSeats = 150;
	Show() {
		booking = new String[20];
		this.showTime = showTime;
	}
	public String getShowTime() {
		// System.out.println(showTime);
		return showTime;
	}
	public int availableSeatsCount() {
		return availableSeats;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public boolean bookTickets(String[] bookings) {
		this.booking = bookings;
		if (booking.length < availableSeats) {
			for (int i = 0; i < booking.length; i++) {
				availableSeats--;
			}
			return true;
		}
		return false;
	}
	public String[] showAllBookings() {
		String[] result = new String[booking.length];
		System.arraycopy(booking,0,result,0,booking.length);
		return result;
	}
}