package dad.login.signup;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class SignInView extends GridPane{
	
	private Label userLabel, passLabel;
	private TextField userInput;
	private PasswordField passInput;
	
	private Button loginButton, cancelButton;
	
	private CheckBox authMethod;
	
	public SignInView() {
		// Ajustes del GridPane
		super();
		this.setAlignment(Pos.CENTER);
		this.setHgap(5);
		this.setVgap(10);
		
		// Inicialización de los elementos de la vista
		userLabel = new Label("Usuario:");
		passLabel = new Label("Contraseña:");
		
		userInput = new TextField();
		userInput.setPromptText("Nombre de usuario");
		
		passInput = new PasswordField();
		passInput.setPromptText("Contraseña del usuario");
		
		loginButton = new Button("Acceder");
		loginButton.setDefaultButton(true);
		cancelButton = new Button("Cancelar");
		
		authMethod = new CheckBox("Usar LDAP");
		
		HBox botonera = new HBox(5, loginButton, cancelButton);
		botonera.setAlignment(Pos.CENTER);
		// Adición de los elementos al GridPane
		this.addRow(0, userLabel, userInput);
		this.addRow(1, passLabel, passInput);
		this.addRow(2, authMethod);
		this.addRow(3, botonera);
	
		GridPane.setHalignment(userLabel, HPos.LEFT);
		GridPane.setHalignment(passLabel, HPos.LEFT);
		GridPane.setColumnSpan(botonera, 2);
		GridPane.setColumnSpan(authMethod, 2);
		GridPane.setHalignment(authMethod, HPos.CENTER);
		
	}
		
	public TextField getUserInput() {
		return this.userInput;
	}
	
	public PasswordField getPassInput() {
		return this.passInput;
	}
	
	public Button getLoginButton() {
		return this.loginButton;
	}
	
	public Button getCancelButton() {
		return this.cancelButton;
	}
	
	public CheckBox getAuthMethodCheck() {
		return this.authMethod;
	}
}
