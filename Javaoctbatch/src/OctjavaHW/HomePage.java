package OctjavaHW;

public class HomePage {

	public static void main(String[] args) {
		
		SignInPage sip = new SignInPage();
		HomePage hp=sip.login("lisa", "123456");
		
	}

}
