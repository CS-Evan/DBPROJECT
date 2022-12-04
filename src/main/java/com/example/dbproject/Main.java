package com.example.dbproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application {
	DatabaseOps db = new DatabaseOps();

	@Override
	public void start(Stage primaryStage){
		new Menu();
		db.createConnection();
	}
	
}
