public class Card {
	String title;
	String author;
	String subject;
	Card(String title, String author, String subject) {
		this.title = title;
		this.author = author;
		this.subject = subject;
	}

	public String toString() {
        return this.title+" "+this.author+" "+this.subject;
    }
    public String getTitle() {
    	return this.title;
    }
}