public class Quiz {
	int question;
	Question qObj;
	Question[] q;
	int size;

	Quiz() {
		
	}
	Quiz(int question) {
		this.question = question;
		q = new Question[10];
		size = 0;
	}
	public void addQuestion(Question obj) {
		q[size++] = obj;
	}

	public Question getQuestion(int num) {
		return q[num];
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