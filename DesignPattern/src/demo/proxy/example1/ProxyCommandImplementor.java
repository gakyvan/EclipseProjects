package demo.proxy.example1;

public class ProxyCommandImplementor implements ICommand {

	private boolean isAdmin;
	private RealCommandImplementor realSubject;

	public ProxyCommandImplementor(String username, String pwd) {
		if(username.equals("ygakuba@mum.edu")&& pwd.equals("#password@")) {
			isAdmin=true;
			System.out.println("Hello buddy");
		}
		realSubject=new RealCommandImplementor();
	}
	
	@Override
	public void runCommand(String command) throws Exception {
		if(isAdmin==true) {
			realSubject.runCommand(command);
		}else {
			if(command.trim().startsWith("cmd /del")|| command.trim().startsWith("cmd /rm")) {
				throw new Exception("Not supported for none-admin users");
			}else {
				realSubject.runCommand(command);
			}
		}

	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public RealCommandImplementor getRealSubject() {
		return realSubject;
	}

}
