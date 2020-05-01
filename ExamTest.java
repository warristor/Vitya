package Vitya;

public class ExamTest extends Example {

   
    private double examEstimate;
    
    private double minEstimate;

    private boolean testResult;
    
    
    public ExamTest(String participant, String subject1, String subject2, double examEstimate, boolean testResult,double minEstimate) {
	super(participant,subject1,subject2);
	// TODO Auto-generated constructor stub
	
	this.examEstimate = examEstimate;
	this.minEstimate = minEstimate;
	this.testResult = testResult;
	
	
    }
    
    double getExamEstimate() {
	return this.examEstimate;
    }
    
    double getMinEstimate() {
	return this.minEstimate;
    }
    
    double setMinEstimate(double min) {
	return this.minEstimate;
    }

    boolean getTestResult() {
	return this.testResult;
    }

    void getOK() {

	if (examEstimate >= minEstimate & testResult)
	    setPassed(true);
	else
	    setPassed(false);

    }

    @Override
    public String toString() {
	return "ExamTest [Participant= " + getParticipant() + ", Subject1= " + getSubject1() + ", examEstimate1= "
		+ getExamEstimate() + ", Subject2= " + getSubject2() + ", testResult1= " + getTestResult() 
		+ " MinEstimate= " + getMinEstimate()+", Passed= "+ isPassed() + "]\n";
    }

}
