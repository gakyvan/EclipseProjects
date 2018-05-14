package demo.proxy.example1;

public class RealCommandImplementor implements ICommand {

	@Override
	public void runCommand(String command) throws Exception {
		Runtime.getRuntime().exec(command);
		System.out.println("The command '" + command + "' was executed");
	}

}
