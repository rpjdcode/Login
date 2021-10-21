package dad.login.signup;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SignInModel {
	
	private StringProperty user = new SimpleStringProperty();
	private StringProperty pass = new SimpleStringProperty();
	private BooleanProperty ldap = new SimpleBooleanProperty();
	
	public StringProperty userProperty() {
		return this.user;
	}
	
	public String getUser() {
		return this.userProperty().get();
	}
	
	public void setUser(final String user) {
		this.userProperty().set(user);
	}
	
	public StringProperty passProperty() {
		return this.pass;
	}
	
	public String getPass() {
		return this.passProperty().get();
	}
	
	public void setPass(final String pass) {
		this.passProperty().set(pass);
	}

	public BooleanProperty ldapProperty() {
		return this.ldap;
	}
	

	public boolean isLdap() {
		return this.ldapProperty().get();
	}
	

	public void setLdap(final boolean ldap) {
		this.ldapProperty().set(ldap);
	}
}
