package BL;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LinuxApplication extends Application {
    
    public static void main(String[] args) {
        Application.launch(LinuxApplication.class,args);
    }

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Console.fxml"));


		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
}


