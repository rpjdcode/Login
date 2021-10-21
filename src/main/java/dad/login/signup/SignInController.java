package dad.login.signup;

public class SignInController {
	
	private SignInModel model = new SignInModel();
	private SignInView view = new SignInView();
	
	public SignInController() {
		// Líneas del GridPane
		view.getGridLinesCheck().setSelected(false);
		view.gridLinesVisibleProperty().bind(view.getGridLinesCheck().selectedProperty());
	}
	
	public SignInModel getModel() {
		return this.model;
	}
	
	public SignInView getView() {
		return this.view;
	}
	
	// TODO: Establecer lógica y bindeos en Controlador
	
}
