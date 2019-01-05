public class Quiz {
	int question;
	Question qObj;
	Question[] q;
	int size;

	Quiz() {
		q = new Question[10];
		size = 0;
	}
	Quiz(int question) {
		this.question = question;
		q = new Question[10];
		size = 0;
	}
	public void addQuestion(Question obj) {
		q[size++] = obj;
		// for (int i = 0; i < q.length; i++) {
		// 	if (q[i] == null) {
		// 		q[i] = obj;
		// 		size++;
		// 		return q[i];
		// 	}
		// }
		// return null;
	}

	public Question getQuestion(int num) {
		for (int i = 0; i < size; i++) {
				return q[num];
		}
		return null;
	}
	// public void getText() {
	// 	for (int i = 0; i < q.length; i++) {
	// 		System.out.println(qObj.question);
	// 	}
	// }
	// public void commonSelectedOption() {
	// 	String name = "";
	// 	for (int i = 0; i < q.length; i++) {
	// 		for (int j = 0; j < 3; j++) {
				
	// 		}
	// 	}
	// }
}