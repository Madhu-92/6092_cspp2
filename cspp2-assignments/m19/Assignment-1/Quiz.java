class Quiz {
	private String questionText;
	private int maxMarks;
	private String ansChoice;

	public Quiz() {

	}

	public Quiz(String qt, int mm, String as) {
		this.questionText = qt;
		this.maxMarks = mm;
		this.ansChoice = as;
	}

	public String getQuestionText() {
		return this.questionText;
	}

	public int getMaxMarks() {
		return this.maxMarks;
	}

	public String getAnsChoice() {
		return this.ansChoice;
	}

	
}