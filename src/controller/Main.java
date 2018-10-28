package controller;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Company;

public class Main extends Application {
	private static Stage primaryStage;
	private Company company;
	private AnchorPane starWindow;
	private static AnchorPane mainWindow;
	
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Cost For Process");
		
		try {
			  FXMLLoader loader = new FXMLLoader();
			  loader.setLocation(Main.class.getResource("/view/startWindow.fxml"));
			  starWindow = (AnchorPane) loader.load();
			  
			  Scene scene = new Scene(starWindow);
	          primaryStage.setScene(scene);
	          primaryStage.setResizable(false);
	          primaryStage.getIcons().add(new Image(getClass().getResource("/view/icon.jpg").toExternalForm()));
	          primaryStage.show();
		} catch (Exception e) {
		
		}
	}
	
	public static void costCompany(int departamentsToCost) {
		System.out.println("Funciona"+departamentsToCost);
		
    	
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/MainWindow.fxml"));
			mainWindow = loader.load();
			
			Scene scene2=new Scene(mainWindow);
			primaryStage.setScene(scene2);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    		
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public AnchorPane getStarWindow() {
		return starWindow;
	}

	public void setStarWindow(AnchorPane starWindow) {
		this.starWindow = starWindow;
	}

	

	public static void main(String[] args) {
		launch(args);
	}
}
