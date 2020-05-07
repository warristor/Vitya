package Vitya;

public abstract class Examination {

    private String participant;
    private String subject1;
    private String subject2;
    private boolean passed;
    
    
    Examination(String participant,String subject1,String subject2) {

	this.participant = participant;
	this.subject1 = subject1;
	this.subject2 = subject2;
    }
    
      abstract void calculateTheResult();
     
    
    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    
    public Boolean isPassed() {
	return passed;
    }

    public void setPassed(boolean passed) {
	this.passed = passed;
    }

    

    public String getParticipant() {
	return participant;
    }

    public void setParticipant(String participant) {
	this.participant = participant;
    }

}
