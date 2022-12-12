package com.example.dbproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EmployeeMenu extends Stage{

//	public EmployeeMenu() {
//		// TODO Auto-generated constructor stub
//	}

	DatabaseOps db = new DatabaseOps();

	Button btn = new Button("Back");
	Button submitBtn = new Button("Submit");
	GridPane grid = new GridPane();
	// Labels
	Label fnameLbl = new Label(" First Name: ");
	Label lnameLbl = new Label(" Last Name: ");
	Label emailLbl = new Label(" Email: ");
	Label phoneLbl = new Label(" Phone #: ");
	Label salaryLbl = new Label(" Salary: ");
	Label hireDateLbl = new Label(" Hire Date: ");

	// Textboxes
	TextField fnameTF = new TextField();
	TextField lnameTF = new TextField();
	TextField emailTF = new TextField();
	TextField phoneTF = new TextField();
	TextField salaryTF = new TextField();
	TextField hireDateTF = new TextField();

	ComboBox employeeListCmb = new ComboBox();

	ObservableList<String> empList = FXCollections.observableArrayList();


	
	BorderPane bp = new BorderPane();
	
	EmployeeMenu()	{

		//empList.add("Employee 1");
		//empList.add("Employee 2");
		//empList.add("Employee 3");
		empList.addAll(db.showEmployeeRecords());
		
		grid.add(btn, 0, 0);
		
		btn.setOnAction(e -> backMenu());
		
        this.setScene(new Scene(grid, 900, 420));

		// Labels and textfields
		grid.add(employeeListCmb,1,5);
		grid.add(fnameLbl,0,1);
		grid.add(fnameTF,1,1);
		grid.add(lnameLbl,2,1);
		grid.add(lnameTF,3,1);
		grid.add(emailLbl,0,3);
		grid.add(emailTF,1,3);
		grid.add(phoneLbl,2,3);
		grid.add(phoneTF,3,3);
		grid.add(salaryLbl,0,4);
		grid.add(salaryTF,1,4);
		grid.add(hireDateLbl,2,4);
		grid.add(hireDateTF,3,4);

		// Submit button
		grid.add(submitBtn, 2, 5);

		employeeListCmb.setItems(empList);

		//submitBtn.setOnAction(event -> db.showEmployeeRecords());
		submitBtn.setOnAction(event -> fnameTF.setText(db.showEmployeeRecords()));


        
        this.setTitle("Employee Menu");
        this.sizeToScene();
        this.show();

	}

	private void backMenu() {
		
		new Menu();
		this.close();

	
	}
	
	

}
