package com.asd.designpattern.proxy;

public class TestProxy {

	public static void main(String[] args) {
		try {
			ICommandExecutor executor=new CommandExecutorProtectionProxy("username", "password");
			executor.runCommand("cmd /C dir");
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
