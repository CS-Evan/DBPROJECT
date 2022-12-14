package com.example.dbproject;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class jobMenu extends Stage{


	Button btn = new Button("Back");
	GridPane grid = new GridPane();
	Label jobidLbl = new Label(" JobID: ");
	Label detailsLbl = new Label(" Details: ");
	ComboBox jobsList = new ComboBox();

	Button updateBtn = new Button("Update");
	TextArea detailsTF = new TextArea();
		
	BorderPane bp = new BorderPane();
	
	jobMenu(){
		
		
		grid.add(btn, 0, 0);
		
		btn.setOnAction(e -> backMenu());
		
        this.setScene(new Scene(grid, 900, 420));
        
        this.setTitle("Jobs Menu");
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
