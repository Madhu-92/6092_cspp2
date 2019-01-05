public class Question {
	String question;
	String[] options;
	Participant pObj;
	int count;
	Question() {
		options = new String[4];
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
		String name = "";
		// for (int i = 0; i < q.length; i++) {
		// 	for (int j = 0; j < 3; j++) {
				
		// 	}
		// }
		return name;
	}
	public void setOptionVotes(int num) {
		// int count = 0;
		for (int i = 0; i < options.length; i++) {
			pObj.setNum(num);
		}
	}
}