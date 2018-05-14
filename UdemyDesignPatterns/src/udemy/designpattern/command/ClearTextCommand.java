package udemy.designpattern.command;

public class ClearTextCommand extends AbstractCommand{

	private String undoText;
	
	public ClearTextCommand(TextEditor textEditor) {
		super(textEditor);
	}
	
	@Override
	public void action() {
		undoText=getTextEditor().getText();
		getTextEditor().setText("");
	}

	@Override
	public void undo() {
		getTextEditor().setText(undoText);
	}

	public String getUndoText() {
		return undoText;
	}

	public void setUndoText(String undoText) {
		this.undoText = undoText;
	}
	
	

}
