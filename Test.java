package Vitya;

public class Test extends Example {

    private String test1;
    private String test2;

    private boolean testResult1;
    private boolean testResult2;

    public Test(String participant, String test1, String test2, boolean testResult1, boolean testResult2) {
	super(participant);
	this.test1 = test1;
	this.test2 = test2;
	this.testResult1 = testResult1;
	this.testResult2 = testResult2;
    }

    String getTest1() {
	return this.test1;
    }

    String getTest2() {
	return this.test2;
    }

    boolean getTestResult1() {
	return this.testResult1;
    }

    boolean getTestResult2() {
	return this.testResult2;
    }

    void getOK() {

	if (testResult1 & testResult2)
	    setPassed(true);
	else
	    setPassed(false);

    }

    @Override
    public String toString() {
	return "Exam [Participant= " + getParticipant() + ", Test1= " + getTest1() + ", testResult1= "
		+ getTestResult1() + ", Test2= " + getTest2() + ", testResult2= " + getTestResult2() + ", Passed= "
		+ isPassed() + "]\n";
    }

}
