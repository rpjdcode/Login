package dad.login;

import dad.login.signup.SignInController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private SignInController loginController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		loginController = new SignInController();
		
		Scene signInScene = new Scene(loginController.getView(), 400, 400);
		
		Stage signInStage = new Stage();
		signInStage.setTitle("Login MVC");
		signInStage.setScene(signInScene);
		signInStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void init() throws Exception{
		System.out.println("Iniciando APP");
	}
	
	@Override
	public void stop() throws Exception{
		System.out.println("Apagando APP");
	}

}
