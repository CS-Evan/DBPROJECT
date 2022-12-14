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
	Button submitBtn = new Button("Update");
	GridPane grid = new GridPane();
	// Labels
	Label fnameLbl = new Label(" First Name: ");
	Label lnameLbl = new Label(" Last Name: ");
	Label emailLbl = new Label(" Email: ");
	Label phoneLbl = new Label(" Phone #: ");
	Label salaryLbl = new Label(" Salary: ");
	Label hireDateLbl = new Label(" Hire Date: ");
	Label managerIdLbl = new Label(" Manager ID: ");
	Label jobIdLbl = new Label(" JobID: ");
	Label deptIdLbl = new Label(" Dept ID: ");
	Label employeesQueryLbl = new Label(" Employee List: ");

	// Textboxes
	TextField fnameTF = new TextField();
	TextField lnameTF = new TextField();
	TextField emailTF = new TextField();
	TextField phoneTF = new TextField();
	TextField salaryTF = new TextField();
	TextField hireDateTF = new TextField();
	TextField jobIdTF = new TextField();
	TextField managerIdTF = new TextField();
	TextField deptIdTF = new TextField();

	ComboBox employeeListCmb = new ComboBox();

	//ObservableList<String> empList = FXCollections.observableArrayList();


	
	BorderPane bp = new BorderPane();
	
	EmployeeMenu()	{

		//empList.add("Employee 1");
		//empList.add("Employee 2");
		//empList.add("Employee 3");
		//empList.addAll(db.showEmployeeRecords());
		
		grid.add(btn, 0, 0);
		
		btn.setOnAction(e -> backMenu());
		
        this.setScene(new Scene(grid, 900, 420));

		// Labels and textfields
		grid.add(employeesQueryLbl,0,8);
		grid.add(employeeListCmb,1,8);
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
		grid.add(hireDateLbl,2,5);
		grid.add(hireDateTF,3,5);
		grid.add(jobIdLbl,0,5);
		grid.add(jobIdTF,1,5);
		grid.add(managerIdLbl,2,6);
		grid.add(managerIdTF,3,6);
		grid.add(deptIdLbl,0,6);
		grid.add(deptIdTF,1,6);

		// Submit button
		grid.add(submitBtn, 2, 7);

		//employeeListCmb.setItems(empList);

		//submitBtn.setOnAction(event -> db.showEmployeeRecords());
		submitBtn.setOnAction(event -> fnameTF.setText(db.showEmployeeRecord(fnameTF.getText(), lnameTF.getText())));


        
        this.setTitle("Employee Menu");
        this.sizeToScene();
        this.show();

	}

	private void backMenu() {
		
		new Menu();
		this.close();

	
	}
	
	

}
