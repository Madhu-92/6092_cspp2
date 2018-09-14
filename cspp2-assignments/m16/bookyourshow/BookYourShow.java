import java.util.Arrays;

class BookYourShow {
	private List<Show> showDetails;
	private List<String> bookedTickets;

	public BookYourShow() {
		showDetails = new List<Show>();

		bookedTickets = new List<String>();
	}

	public void addAShow(Show obj) {
		showDetails.add(obj);
	}

	public Show getAShow(String movieName, String dateTime) {
		for (int i = 0; i < showDetails.size(); i++) {
			if (showDetails.get(i).getMovieName().equals(movieName) && 
				showDetails.get(i).getDateTime().equals(dateTime)) {
				return showDetails.get(i);
			}
		}
		return null;
	}

	public void bookAShow(String movieName, String dateTime, Patron obj, String[] seats) {
		Show movieData = getAShow(movieName, dateTime);
    if (movieData != null) {
      for (int i = 0; i < movieData.getSeats().length; i++) {
        for (int j = 0; j < seats.length; j++) {
          if (seats[j].equals(movieData.getSeats()[i])) {
            movieData.setSeat(i, "N/A");
            bookedTickets.add(obj.getMobileNumber()
                              + " " + movieName + " " + dateTime);
          }
        }
      }
    } else {
      System.out.println("No show");
    }
  }

  public void printTickets(final String movieName, final String dateTime,
                           final String mobileNumber) {
    for (int i = 0; i < bookedTickets.size(); i++) {
      if ((mobileNumber + " " + movieName
           + " " + dateTime).equals(bookedTickets.get(i))) {
        System.out.println(mobileNumber
                           + " " + movieName + " " + dateTime);
        return;
      }
    }
    System.out.println("Invalid");
    return;
  }

  public void showAll() {
    for (int i = 0; i < showDetails.size(); i++) {

      System.out.println(showDetails.get(i).toString()+ "," + Arrays.toString(showDetails.get(i).getSeats()).replace(" ", ""));
    }
  }

}