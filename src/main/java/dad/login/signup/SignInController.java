package dad.login.signup;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class SignInController {
	
	private SignInModel model = new SignInModel();
	private SignInView view = new SignInView();
	
	public SignInController() {
		
		Bindings.bindBidirectional(view.getUserInput().textProperty(), model.userProperty());
		Bindings.bindBidirectional(view.getPassInput().textProperty(), model.passProperty());
		Bindings.bindBidirectional(view.getAuthMethodCheck().selectedProperty(), model.ldapProperty());
		
		view.getLoginButton().setOnAction(e -> onLoginButtonAction(e));
		view.getCancelButton().setOnAction(e -> onCancelButtonAction(e));
	}
	
	public SignInModel getModel() {
		return this.model;
	}
	
	public SignInView getView() {
		return this.view;
	}
	
	
	private void onLoginButtonAction(ActionEvent e) {
		AuthService auth = (model.isLdap()) ? new LdapAuthService() : new FileAuthService();
		String usuario = view.getUserInput().getText();
		String pass = view.getPassInput().getText();
		
		try {
			if (auth.login(usuario, pass)) {
				Alert alerta = new Alert(AlertType.INFORMATION);
				alerta.setHeaderText("Acceso Permitido");
				alerta.setContentText("Las credenciales de acceso son válidas");
				alerta.show();
			} else {
				Alert alerta = new Alert(AlertType.ERROR);
				alerta.setHeaderText("Acceso denegado");
				alerta.setContentText("El usuario y/o la contraseña no son válidos");
				alerta.show();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	private void onCancelButtonAction(ActionEvent e) {
		Stage st = (Stage)view.getCancelButton().getScene().getWindow();
		st.close();
//		Node nodo = (Node)e.getSource();
//		Stage stg = (Stage)nodo.getScene().getWindow();
//		stg.close();
	}
	
	
}
