package com.example.dbproject;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class depMenu extends Stage {

	Label jobidLbl = new Label(" JobID: ");
	Label detailsLbl = new Label(" Details: ");
	ComboBox jobsList = new ComboBox();
	Button btn = new Button("Back");
	Button updateBtn = new Button("Update");
	TextArea detailsTF = new TextArea();
	GridPane grid = new GridPane();
		
	BorderPane bp = new BorderPane();
	
	depMenu(){
		
		
		grid.add(btn, 0, 0);
		
		btn.setOnAction(e -> backMenu());
		
        this.setScene(new Scene(grid, 900, 420));
        
        this.setTitle("Department Menu");
        this.sizeToScene();
        this.show();
		detailsTF.setPrefWidth(500);
		detailsTF.setPrefHeight(100);
		grid.add(jobidLbl,0,1);
		grid.add(jobsList,2,1);
		grid.add(detailsLbl,0,2);
		grid.add(detailsTF,2,2);
		grid.add(updateBtn,2,3);

	}

	private void backMenu() {
		new Menu();
		this.close();

	
	}

}
