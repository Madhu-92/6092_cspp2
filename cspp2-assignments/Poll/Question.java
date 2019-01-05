public class Question {
	String question;
	String[] options;
	Participant pObj;
	Participant[] part;
	int count;
	Question() {
		options = new String[4];
		part = new Participant[4];
		count = 0;
	}
	Question(String question, String[] options) {
		this.question = question;
		this.options = options;
	}
	public int indexOf(String name) {
		for (int i = 0; i < options.length; i++) {
			if (options[i].equals("name")) {
				return i;
			}
		}
		return -1;
	}
	public String getText() {
		return question;
		
	}
	public String commonSelectedOption() {
		String str = "";
		int count = 0;
		for (int i = 0; i < options.length; i++) {
			
		}
		return str;
	}
	public void setOptionVotes(int num) {
		int votes = 0;
		for (int i = 0; i < part.length; i++) {
			if (part[i].num == num) {
				votes++;
			}
		}
		// int[] num = new int[num];
	}
}