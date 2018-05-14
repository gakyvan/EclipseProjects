package udemy.designpattern.command;

public class AddTextCommand extends AbstractCommand{

	private String undoText;
	private String addedText;
	
	public AddTextCommand(TextEditor textEditor, String addedText) {
		super(textEditor);
		this.addedText=addedText;
	}

	@Override
	public void action() {
		undoText=getTextEditor().getText();
		getTextEditor().setText(getTextEditor().getText()+" "+addedText);
		
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

	public String getAddedText() {
		return addedText;
	}

	public void setAddedText(String addedText) {
		this.addedText = addedText;
	}

}
