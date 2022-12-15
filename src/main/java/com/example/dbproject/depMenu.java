package com.example.dbproject;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class depMenu extends Stage {

	Button btn = new Button("Back");
	GridPane grid = new GridPane();
		
	BorderPane bp = new BorderPane();

	Label deptIdLbl = new Label(" Dept ID: ");
	Label deptNameLbl = new Label(" Dept Name: ");
	Label deptManagerLbl = new Label(" Dept Manager: ");
	ComboBox deptList = new ComboBox();
	Button updateBtn = new Button("Update");
	TextField deptIdTF = new TextField();
	TextField deptManagerTF = new TextField();
	
	depMenu(){
		
		
		grid.add(btn, 0, 0);
		
		btn.setOnAction(e -> backMenu());
		
        this.setScene(new Scene(grid, 900, 420));
        
        this.setTitle("Department Menu");
        this.sizeToScene();
        this.show();

		grid.add(deptNameLbl,0,1);
		grid.add(deptList,1,1);

		grid.add(deptIdLbl,0,2);
		grid.add(deptIdTF,1,2);

		grid.add(deptManagerLbl,0,3);
		grid.add(deptManagerTF,1,3);
		grid.add(updateBtn,1,4);

	}

	private void backMenu() {
		new Menu();
		this.close();

	
	}

}
