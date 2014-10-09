import java.util.ArrayList;
import java.util.Random;


public class main {

	public static void main(String[] args) {
		
		/*ForeseeableAction A = new ForeseeableAction(3);
		
		while(!A.isFinished())
		{
			System.out.println("Etat : " + A.getTime());
			System.out.println("Ready : " + A.isReady());
			System.out.println("In progress : " + A.isInProgress());
			System.out.println("Finished : "+A.isFinished());
			A.doStep;
		}*/
		
		ArrayList<Action> a = new ArrayList<Action>();
		Random rand = new Random();
		for(int i=0;i<20;i++)
		{
			a.add(new ForeseeableAction(2 + (int)(Math.random()*6 )));
		}
		
		SequentialScheduler SS = new SequentialScheduler(a);
		
			
			SS.doStep();
			//System.out.println(SS.getAction(j));
		
		
	}

}
