package Vitya;

public class Tests extends Examination {
    
    private boolean testResult1;
    private boolean testResult2;

    public Tests(String participant, String subject1, String subject2, boolean testResult1, boolean testResult2) {
	super(participant,subject1,subject2);
	this.testResult1 = testResult1;
	this.testResult2 = testResult2;
    }
    

    boolean getTestResult1() {
	return this.testResult1;
    }
    
    boolean getTestResult2() {
	return this.testResult2;
    }

   @Override
   public void calculateTheResult() {

	if (testResult1 & testResult2)
	    setPassed(true);
	else
	    setPassed(false);

    }
   
   
    @Override
    public String toString() {
	return "Tests [Participant= " + getParticipant() + ", Subject1= " + getSubject1() + ", testResult1= "
		+ getTestResult1() + ", Subject2= " + getSubject2() + ", testResult2= " + getTestResult2() + ", Passed= "
		+ isPassed() + "]\n";
    }

}
