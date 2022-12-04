package com.example.dbproject;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	DatabaseOps db = new DatabaseOps();

		public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage){
		new Menu();
		db.createConnection();
	}
}
