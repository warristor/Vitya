package Vitya;

public abstract class Example {

    private String participant;
    private boolean passed;

    public Boolean isPassed() {
	return passed;
    }

    public void setPassed(boolean passed) {
	this.passed = passed;
    }

    Example(String participant) {

	this.participant = participant;

    }

    public String getParticipant() {
	return participant;
    }

    public void setParticipant(String participant) {
	this.participant = participant;
    }

}
