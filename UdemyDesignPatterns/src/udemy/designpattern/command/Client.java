package udemy.designpattern.command;

public class Client {
	public static void main(String[] args) {
		TextEditor ted = new TextEditor();
		ted.setText("Yvan GAKUBA");
		ClearTextCommand clearCommand = new ClearTextCommand(ted);
		ted.executionAction(clearCommand);
		System.out.println("Text is: " + ted.getText());
		ted.executionUndo();
		System.out.println("Text is: " + ted.getText());
		
		AddTextCommand addTextCommand=new AddTextCommand(ted, "Yves GAKUBA");
		ted.executionAction(addTextCommand);
		System.out.println("Text is: "+ ted.getText());
		ted.executionUndo();
		System.out.println("Text is: " + ted.getText());
	}
}
