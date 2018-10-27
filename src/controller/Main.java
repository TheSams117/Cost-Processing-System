package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Company;

public class Main extends Application {
	private Stage primaryStage;
	private Company company;
	private AnchorPane starWindow;
	
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
	
	public void costCompany(int departamentsToCost) {
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
