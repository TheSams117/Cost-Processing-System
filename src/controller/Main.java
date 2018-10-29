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
	private static Company company;
	private static AnchorPane window;
	
	@Override
	public void start(Stage primaryStage) {
		company = new Company("asdas",12);
		Main.primaryStage = primaryStage;
		Main.primaryStage.setTitle("Costos Por Procesos");
		
		try {
			  FXMLLoader loader = new FXMLLoader();
			  loader.setLocation(Main.class.getResource("/view/startWindow.fxml"));
			  window = (AnchorPane) loader.load();
			  
			  Scene scene = new Scene(window);
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
			window = loader.load();
			Scene scene=new Scene(window);
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
			window = loader.load();
			Scene scene=new Scene(window);
			primaryStage.setScene(scene);
			primaryStage.centerOnScreen();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    		
	}
	
	public static void calculate() {
		
    	
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/CalculatetWindow.fxml"));
			window = loader.load();
			Scene scene=new Scene(window);
			primaryStage.setScene(scene);
			primaryStage.centerOnScreen();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    		
	}
	
	
	public static int getDepartments() {
		return departments;
	}

	public static void setDepartments(int departments) {
		Main.departments = departments;
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
		Main.company = company;
	}


	public static AnchorPane getWindow() {
		return window;
	}

	public static void setWindow(AnchorPane window) {
		Main.window = window;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
