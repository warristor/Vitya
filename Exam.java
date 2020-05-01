package Vitya;

public class Exam extends Example {
   
    private int examEstimate1;
    private int examEstimate2;
    private int minEstimate;
   


    public Exam(String participant, String subject1, String subject2, int examEstimate1, int examEstimate2, int minEstimate) {
	super(participant,subject1,subject2);

	this.examEstimate1 = examEstimate1;
	this.examEstimate2 = examEstimate2;
	this.minEstimate = minEstimate;
    }
    
       

    int getExamEstimate1() {
	return this.examEstimate1;
    }

    int getExamEstimate2() {
	return this.examEstimate2;
    }
    
    
    public int getMinEstimate() {
        return minEstimate;
    }


    public void setMinEstimate(int min) {
        this.minEstimate = min;
    }

    void getOK() {
	int sum = examEstimate1 + examEstimate2;
	if (sum >= minEstimate)
	    setPassed(true);
	else
	    setPassed(false);

    }

    @Override
    public String toString() {
	return "Exam [Participant= " + getParticipant() + ", Subject1= " + getSubject1() + ", examEstimate1= "
		+ getExamEstimate1() + ", Subject2= " + getSubject2() + ", examEstimate2= " + getExamEstimate2()
		+ ", MinEstimate= "+ getMinEstimate() + ", Passed= " + isPassed() + "]\n";
    }

}
