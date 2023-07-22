package application;
	

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException{
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

                @Override
                public void handle(WindowEvent arg0) {
                    Platform.exit();
                    System.exit(0);
                    
                }
			    
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
