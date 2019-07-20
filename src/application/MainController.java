package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController{
	
	@FXML
	StackPane root;
	@FXML
	BorderPane loginPane;
	@FXML
	BorderPane landingPane;
	@FXML
	BorderPane checkOutPane;
	@FXML
	BorderPane checkInPane;
	@FXML
	BorderPane inventorySelectPane;
	@FXML
	BorderPane inventoryRemovePane;
	@FXML
	BorderPane inventoryTransferPane;
	@FXML
	BorderPane inventoryShelvePane;
	@FXML
	BorderPane inventoryAddToStockPane;
	@FXML
	BorderPane popupPane;
	@FXML
	BorderPane searchPane;
	@FXML
	TextField loginLibraryID;
	@FXML
	TextField loginPassword;
	@FXML
	TextField checkInID;
	@FXML
	TextField checkInISBN;
	@FXML
	TextField checkOutID;
	@FXML
	TextField checkOutISBN;
	@FXML
	TextField searchISBN;
	@FXML
	TextField searchTitle;
	@FXML
	TextField searchAuthor;
	@FXML
	TextField searchGenre;
	@FXML
	TextField searchShelfCode;
	@FXML
	TextField searchID;
	@FXML
	TextField addISBN;
	@FXML
	TextField addTitle;
	@FXML
	TextField addAuthor;
	@FXML
	TextField addGenre;
	@FXML
	TextField addShelfCode;
	@FXML
	TextField addQuantity;
	@FXML
	TextField removeISBN;
	@FXML
	TextField removeQuantity;
	@FXML
	TextField transferLibraryID;
	@FXML
	TextField transferISBN;
	@FXML
	TextField transferQuantity;
	@FXML
	TextField shelveISBN;
	@FXML
	TextField shelveShelfCode;
	
	

	public void login() throws Exception{
		try {
			/*
			if(isPassword(loginPassword.getText())) {
				loginPane.setVisible(false);
				landingPane.setVisible(true);
			}
			else {
				Stage errorStage = new Stage();
				BorderPane errorPane = new BorderPane();
				VBox errorBox = new VBox();
				Label errorLbl = new Label("Error: Password Incorrect, please try again");
				Button errorBtn = new Button("Close");
				errorBtn.setOnAction(e->{
					errorStage.hide();
				});
				errorBox.getChildren().addAll(errorLbl, errorBtn);
				errorPane.setCenter(errorBox);
				Scene errorScene = new Scene(errorPane);
				errorStage.setScene(errorScene);
			}
			*/
			loginPane.setVisible(false);
			landingPane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkInPane() throws Exception{
		try {
			landingPane.setVisible(false);
			checkInPane.setVisible(true);
	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkOutPane() throws Exception{
		try {
			landingPane.setVisible(false);
			checkOutPane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void inventorySelectPane() throws Exception{
		try {
			landingPane.setVisible(false);
			inventoryShelvePane.setVisible(false);
			inventoryTransferPane.setVisible(false);
			inventoryAddToStockPane.setVisible(false);
			inventoryRemovePane.setVisible(false);
			inventorySelectPane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void inventoryAddToStockPane() throws Exception{
		try {
			inventorySelectPane.setVisible(false);
			inventoryAddToStockPane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void inventoryRemovePane() throws Exception{
		try {
			inventorySelectPane.setVisible(false);
			inventoryRemovePane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void inventoryTransferPane() throws Exception{
		try{
			inventorySelectPane.setVisible(false);
			inventoryTransferPane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void inventoryShelvePane() throws Exception{
		try{
			inventorySelectPane.setVisible(false);
			inventoryShelvePane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchPane() throws Exception{
		try{
			landingPane.setVisible(false);
			searchPane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void landingPane() throws Exception{
		try{
			checkInPane.setVisible(false);
			checkOutPane.setVisible(false);
			inventorySelectPane.setVisible(false);
			searchPane.setVisible(false);
			landingPane.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void back() throws Exception{
		try {
			if(checkInPane.isVisible() || checkOutPane.isVisible() || inventorySelectPane.isVisible() || searchPane.isVisible()) {
				landingPane();
			}
			
			else if(inventoryTransferPane.isVisible() || inventoryAddToStockPane.isVisible() || inventoryRemovePane.isVisible() || inventoryShelvePane.isVisible()) {
				inventorySelectPane();
			}
			
			else {
				System.out.print("You dun goofed");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkIn() throws Exception{
		try{
			System.out.print("Checking in with:\rStudent ID: " + checkInID.getText() + "\rISBN: " + checkInISBN.getText());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkOut() throws Exception{
		try{
			System.out.print("Checking Out with:\rStudent ID: " + checkOutID.getText() + "\rISBN: " + checkOutISBN.getText() + "\r");
			//CloudPlatformIntegration.checkOut(Integer.parseInt(checkOutISBN.getText()), Integer.parseInt(checkOutID.getText()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void search() throws Exception{
		try {	
			if(searchISBN.getText() != null) {
				System.out.print("Searching with:\rISBN: " + searchISBN.getText());
			}
			else if(searchTitle.getText() != null) {
				System.out.print("Searching with:\rTitle: " + searchTitle.getText());
			}
			else if(searchAuthor.getText() != null) {
				System.out.print("Searching with:\rAuthor: " + searchAuthor.getText());
			}
			else if(searchGenre.getText() != null) {
				System.out.print("Searching with:\rGenre: " + searchGenre.getText());
			}
			else if(searchShelfCode.getText() != null) {
				System.out.print("Searching with:\rLocation: " + searchShelfCode.getText());
			}
			else if(searchID.getText() != null) {
				System.out.print("Searching with:\rID: " + searchID.getText());
			}
			else {
				System.out.print("You goofed sir");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addToStock() throws Exception{
		try {
			if(addISBN.getText() != null && addQuantity.getText() != null && addTitle.getText() == null) {
				System.out.print("Adding new book with ISBN: " + addISBN.getText() + " and assuming ISBN is already in system, incrementing current quantity by +" + addQuantity.getText());
			}
			else if(addISBN.getText() != null && addTitle.getText() != null && addAuthor.getText() != null && addGenre.getText() != null && addShelfCode.getText() != null && addQuantity.getText() != null) {
				System.out.print("Adding a new book with" + 
						"\rISBN: " + addISBN.getText() + 
						"\rTitle: " + addTitle.getText() +
						"\rAuthor: " + addAuthor.getText() +
						"\rGenre: " + addGenre.getText() +
						"\rLocation: " + addShelfCode.getText() + 
						"\rQuantity: " + addQuantity.getText());
			}
			else {
				System.out.println("You goofed");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void remove() throws Exception{
		try{
			if(removeISBN.getText() != null && removeQuantity.getText() != null) {
				System.out.println("Removing book with" +
						"\rISBN: " + removeISBN.getText() + 
						"\rQuantity" + removeQuantity.getText());
				
			}
			else {
				System.out.println("Goofed, you have");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void transfer() throws Exception{
		try{
			if(transferLibraryID.getText() != null && transferISBN.getText() != null && transferQuantity.getText() != null) {
				System.out.println("Transferring " + transferQuantity.getText() + " copies of book with ISBN: " + transferISBN.getText() + " to library ID: " + transferLibraryID.getText());
			}
			else {
				System.out.println("You really shouldn't have done something so goofy");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void shelve() throws Exception{
		try {
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}