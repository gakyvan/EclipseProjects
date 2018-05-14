package demo.proxy.example1;

public class ProxyPatternClient {
	public static void main(String[] args) {
		ProxyCommandImplementor pci = new ProxyCommandImplementor("ydakuba@mum.edu", "#password@");
		try {
			pci.runCommand("cmd /B dir");
			pci.runCommand("cmd /ls -ltr");
			pci.runCommand("cmd /rm -rf abc.pdf");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
