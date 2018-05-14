package udemy.designpattern.command;

import java.util.LinkedList;
import java.util.Queue;

public class TextEditor {
	
	private String text;
	private Queue<Command> queueCommand = new LinkedList<>();
	
	public void executionAction(Command command) {
		command.action();
		queueCommand.add(command);
	}
	
	public void executionUndo() {
		Command command=queueCommand.poll();
		if(command!=null) {
			command.undo();
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Queue<Command> getQueueCommand() {
		return queueCommand;
	}

	public void setQueueCommand(Queue<Command> queueCommand) {
		this.queueCommand = queueCommand;
	}

}
