import java.util.ArrayList;


public class SequentialScheduler extends Scheduler {

	public SequentialScheduler(ArrayList<Action> a) {
		super(a);
	}
	

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFinished() {
		return !(this.currentAction.hasNext());
	}

	@Override
	public boolean isInProgress() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void reallyDoStep() {
		int j=0;
		do
		{
			
			Action a = this.nextAction();
			do
			{
				System.out.println(this.getAction(j));
				a.doStep();
				
			}
			while(!(a.isFinished()));
			j++;
		}
		while(this.currentAction.hasNext());

	}

}
