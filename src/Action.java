
public abstract class Action {

	public abstract boolean isReady();
	public abstract boolean isFinished();
	public abstract boolean isInProgress();
	
	public void doStep() {
		// test
		this.reallyDoStep();
		
	}
	public abstract void reallyDoStep();
	
}
