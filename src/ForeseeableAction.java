
public class ForeseeableAction extends Action {

	protected final int initial;
	protected int time;
	
	public ForeseeableAction(int init)
	{
		if(init <= 0) 
		{
			throw new IllegalArgumentException();
		}
		this.initial = init;
		this.time = init;
		
	}
	
	public int getTime()
	{
		return this.time;
	}
	
	public boolean isReady() {
		return this.time == this.initial;
	}

	public boolean isFinished() {
		return this.time == 0;
	}

	public boolean isInProgress() {
		return 0 < this.time && this.time <this.initial;
	}

	


	public void reallyDoStep() {
		this.time--;
		
	}

	@Override
	public String toString() {
		return "Temps total : " + this.initial+'\n'+"Etape n°"+this.time;
	}
	


}
