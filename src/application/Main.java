package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		try {
			StackPane landing = (StackPane) FXMLLoader.load(Main.class.getResource("Master.fxml"));
			Scene scene = new Scene(landing);
			primaryStage.setScene(scene);
			//primaryStage.setFullScreen(true);
			primaryStage.show();
		} catch(Exception e) {
			System.out.print(e);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
