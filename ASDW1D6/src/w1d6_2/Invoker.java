package w1d6_2;

import java.util.Stack;

public class Invoker {

	private Command currentCommand= null;
	
	private Stack<Command> commandsExecuted = new Stack<Command>();
	public String createSquare(Square sq){
		currentCommand= new ConcreateCommand(sq);
		return currentCommand.create5();
	}
	
	public void createbox(Square sq){
		currentCommand= new ConcreateCommand(sq);
		
		if(currentCommand.create5()!=" " || currentCommand.Scale2()!=" " ||
				currentCommand.Moveright3()!=" "){
			commandsExecuted.pop().undo();
			System.out.println("Operation is Succesfully completed");
		} else {
			System.out.println("Operation is failed");
		}
		
	}
}
