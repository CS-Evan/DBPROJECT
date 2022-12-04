package com.example.dbproject;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu extends Stage {
	
	Button empBtn = new Button("Employee Main Menu");
	Button jobBtn = new Button("Jobs Main Menu");
	Button depBtn = new Button("Departments Main Menu");
	GridPane root = new GridPane();

//	public Menu() {
//		// TODO Auto-generated constructor stub
//	}	
	
    Menu() {
	
		
        root.setHgap(5);
        root.setVgap(5);
		root.add(empBtn, 0, 0);
		root.add(jobBtn, 1, 0);
		root.add(depBtn, 2, 0);
		
		

		empBtn.setOnAction(e -> empHandler());
		jobBtn.setOnAction(e -> jobHandler());
		depBtn.setOnAction(e -> depHandler());
		
		
		this.setScene(new Scene(root, 900, 420));
        this.setTitle("HR Application");
        this.sizeToScene();
        this.show();
	}
	
	private void empHandler(){
		
		
			new EmployeeMenu();
			this.close();
	
	}
	private void jobHandler(){
		
		
		new jobMenu();
		this.close();
		
	}
	private void depHandler(){
		
		
		new depMenu();
		this.close();
		
	}
	
	
	

	
//	public static void main(String[] args) {
//		
//		launch(args);
//
//	}
}
