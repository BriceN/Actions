import java.util.ArrayList;
import java.util.Iterator;



public abstract class Scheduler extends Action {

	protected ArrayList<Action> ActionList;
	protected Iterator<Action> currentAction;
	
	public Scheduler(ArrayList<Action> ActionList) {
		this.ActionList = ActionList;
		this.currentAction = ActionList.iterator();
	}
	
	public void add(Action a) {
		this.ActionList.add(a);

	}
	
	public Action getAction(int i)
	{
		return ActionList.get(i);
	}
	
	public Action nextAction() {
		return this.currentAction.next();
	}
}
