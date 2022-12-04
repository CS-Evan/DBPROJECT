package com.example.dbproject;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EmployeeMenu extends Stage{

//	public EmployeeMenu() {
//		// TODO Auto-generated constructor stub
//	}
	
	
	Button btn = new Button("Back");
	GridPane grid = new GridPane();
	
	BorderPane bp = new BorderPane();
	
	EmployeeMenu()	{
		
		grid.add(btn, 0, 0);
		
		btn.setOnAction(e -> backMenu());
		
		
        this.setScene(new Scene(grid, 900, 420));
        
        this.setTitle("Employee Menu");
        this.sizeToScene();
        this.show();
	}

	private void backMenu() {
		
		new Menu();
		this.close();

	
	}

	
	

}
