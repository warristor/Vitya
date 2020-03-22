package Vitya;

public class Exam extends Example {

    private String exam1;
    private String exam2;

    private int examEstimate1;
    private int examEstimate2;

    public Exam(String participant, String exam1, String exam2, int examEstimate1, int examEstimate2) {
	super(participant);
	this.exam1 = exam1;
	this.exam2 = exam2;
	this.examEstimate1 = examEstimate1;
	this.examEstimate2 = examEstimate2;
    }

    String getExam1() {
	return this.exam1;
    }

    String getExam2() {
	return this.exam2;
    }

    int getExamEstimate1() {
	return this.examEstimate1;
    }

    int getExamEstimate2() {
	return this.examEstimate2;
    }

    void getOK(int min) {
	int sum = examEstimate1 + examEstimate2;
	if (sum >= min)
	    setPassed(true);
	else
	    setPassed(false);

    }

    @Override
    public String toString() {
	return "Exam [Participant= " + getParticipant() + ", Exam1= " + getExam1() + ", examEstimate1= "
		+ getExamEstimate1() + ", Exam2= " + getExam2() + ", examEstimate2= " + getExamEstimate2()
		+ ", Passed= " + isPassed() + "]\n";
    }

}
