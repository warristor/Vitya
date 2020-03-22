package Vitya;

public class ExamTest extends Example {

    private String exam1;

    private String test1;

    private double examEstimate1;

    private boolean testResult1;

    public ExamTest(String participant, String exam1, String test1, double examEstimate1, boolean testResult1) {
	super(participant);
	// TODO Auto-generated constructor stub
	this.exam1 = exam1;
	this.test1 = test1;
	this.examEstimate1 = examEstimate1;
	this.testResult1 = testResult1;
    }

    String getExam1() {
	return this.exam1;
    }

    String getTest1() {
	return this.test1;
    }

    double getExamEstimate1() {
	return this.examEstimate1;
    }

    boolean getTestResult1() {
	return this.testResult1;
    }

    void getOK(double min) {

	if (examEstimate1 >= min & testResult1)
	    setPassed(true);
	else
	    setPassed(false);

    }

    @Override
    public String toString() {
	return "Exam [Participant= " + getParticipant() + ", Exam1= " + getExam1() + ", examEstimate1= "
		+ getExamEstimate1() + ", Test1= " + getTest1() + ", testResult1= " + getTestResult1() + ", Passed= "
		+ isPassed() + "]\n";
    }

}
