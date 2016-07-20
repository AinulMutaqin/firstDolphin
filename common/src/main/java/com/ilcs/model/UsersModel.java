package com.ilcs.model;

import com.canoo.dolphin.mapping.DolphinBean;
import com.canoo.dolphin.mapping.Property;

/**
 * Defines the model of the MVC that is defined in this example. When using Dolphin Platform a view-controller-pair will
 * share one model that is automatially synchronized between the view on the client and teh controller on the server.
 * The model will automatically instanziated and managed by the platform and its lifecylce is bound to lifecylce of the view.
 *
 * This basic model only contains one value. When defining models with Dolphin Platform all attributes must be
 * defined as observable properties. To do so Dolphin Platform provides the {@link Property} interface. A property
 * can contain a primitive datatype like String or int. In addition a property can contain another Dolphin Platform
 * model. By doing so a hierarchy can be defined. In addition Dolphin Platform contains extensions for the Java
 * collections API like an observable list. This types can be used in model classes, too.
 */
@DolphinBean
public class UsersModel {
	/**
     * The value that is part of this model
     */
	private Property<Integer> userId;
	private Property<String> username;
	private Property<String> lastname;
	private Property<String> password;
	private Property<Integer> authorization;
	private Property<Integer> idTerminal;
	private Property<String> terminal;
	
	/**
     * This method returns the property. By using this method you can easily add an observer to the property
     * @return thze property
     */
	public Property<Integer> userIdProperty() {
		return userId;
	}
	
	public Property<String> usernameProperty() {
		return username;
	}
	
	public Property<String> lastnameProperty() {
		return lastname;
	}
	
	public Property<String> passwordProperty() {
		return password;
	}
	
	public Property<Integer> authorizationProperty() {
		return authorization;
	}
	
	public Property<Integer> idTerminalProperty() {
		return idTerminal;
	}
	
	public Property<String> terminalProperty() {
		return terminal;
	}

	/**
     * This is a convenience method that defines a getter based on the property.
     * @return the internal value of the property
     */
	public Integer getUserId() {
		return userIdProperty().get();
	}

	public String getUsername() {
		return usernameProperty().get();
	}

	public String getLastname() {
		return lastnameProperty().get();
	}

	public String getPassword() {
		return passwordProperty().get();
	}

	public Integer getAuthorization() {
		return authorizationProperty().get();
	}

	public Integer getIdTerminal() {
		return idTerminalProperty().get();
	}

	public String getTerminal() {
		return terminalProperty().get();
	}

	/**
     * This is a convenience method that defines a setter based on the property.
     * @param value the new internal value of the property
     */
	public void setUserId(Integer userId) {
		userIdProperty().set(userId);
	}

	public void setUsername(String username) {
		usernameProperty().set(username);
	}

	public void setLastname(String lastname) {
		lastnameProperty().set(lastname);
	}

	public void setPassword(String password) {
		passwordProperty().set(password);
	}

	public void setAuthorization(Integer authorization) {
		authorizationProperty().set(authorization);
	}

	public void setIdTerminal(Integer idTerminal) {
		idTerminalProperty().set(idTerminal);
	}

	public void setTerminal(String terminal) {
		terminalProperty().set(terminal);
	}
}
