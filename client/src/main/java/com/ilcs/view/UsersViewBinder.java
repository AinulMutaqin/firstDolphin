package com.ilcs.view;

import com.canoo.dolphin.client.ClientContext;
import com.canoo.dolphin.client.javafx.AbstractViewBinder;
import com.canoo.dolphin.client.javafx.FXBinder;
import com.ilcs.Constants;
import com.ilcs.model.UsersModel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UsersViewBinder extends AbstractViewBinder<UsersModel> {
	/**
     * This UI control is automatically injected by FXML
     */
	@FXML
	private TableView<UsersModel> usersTable;
	
	@SuppressWarnings("rawtypes")
	@FXML
	private TableColumn columnUserId;
	
	@SuppressWarnings("rawtypes")
	@FXML
	private TableColumn columnUsername;
	
	@SuppressWarnings("rawtypes")
	@FXML
	private TableColumn columnLastname;
	
	@SuppressWarnings("rawtypes")
	@FXML
	private TableColumn columnPassword;
	
	@SuppressWarnings("rawtypes")
	@FXML
	private TableColumn columnTerminal;
	
	@FXML
	private Button updateUsers;
	
	/**
     * The constructor calls the super constructor taht initializes the view lifecycle that is defined by Dolphin Platform.
     * This will automatically create a controller instance on the server. In addition the model of this MVC group will
     * be created and synchronized between client and server.
     * @param clientContext the global client context
     */
	public UsersViewBinder(ClientContext clientContext) {
		super(clientContext, Constants.CONTROLLER_USERS);
	}

	/**
     * This method is called when the Dolphin Platform bootstrap for the view is finished. This means that a controller
     * isntance has been created on the server and the model for the MVC group was instantiated on the client and the server.
     * In this client the model is bound to the UI. In addition user interaction that will trigger controller actions is
     * defined.
     */
	@Override
	protected void init() {
		// The FXBinder class is part of the Dolphin Platform JavaFX client API and offers a fluent API to create
        // (bidirectional) bindings between JavaFX properties and Dolphin Platform properties
        FXBinder.bind(columnUsername.textProperty()).bidirectionalTo(getModel().usernameProperty());
        FXBinder.bind(columnLastname.textProperty()).bidirectionalTo(getModel().lastnameProperty());
        FXBinder.bind(columnPassword.textProperty()).bidirectionalTo(getModel().passwordProperty());
        
        // pressing the button will invoke the reset action on the controller instance on the server
        updateUsers.setOnAction(e -> invoke("updateUsers"));
	}
}
