package controller;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Company;

public class Main extends Application {
	private static Stage primaryStage;
	private static int departments;
	private Company company;
	private static AnchorPane starWindow;
	private static AnchorPane mainWindow;
	
	@Override
	public void start(Stage primaryStage) {
		
		Main.primaryStage = primaryStage;
		Main.primaryStage.setTitle("Costos Por Procesos");
		
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
		departments = departamentsToCost;
		
    	
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/MainWindow.fxml"));
			mainWindow = loader.load();
			Scene scene=new Scene(mainWindow);
			primaryStage.setScene(scene);
			primaryStage.centerOnScreen();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    		
	}
	
	public static void back() {
		
    	
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/startWindow.fxml"));
			starWindow = loader.load();
			Scene scene=new Scene(starWindow);
			primaryStage.setScene(scene);
			primaryStage.centerOnScreen();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    		
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		Main.primaryStage = primaryStage;
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
		Main.starWindow = starWindow;
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static int getDepartments() {
		return departments;
	}

	public static void setDepartments(int departments) {
		Main.departments = departments;
	}
}
