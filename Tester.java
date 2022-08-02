package operations;

public class Tester  {

	public static void main(String[] args) {
		
		Operations.createMainFolderIfNotPresent("main");

		MainMenu.welcomeScreen("Locker.Me", "Lalini.b");

		SubMenu.handleWelcomeScreenInput();
	}

}
