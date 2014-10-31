package BL;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class FXMLreader   {
    @FXML private Button ls;
    @FXML private Button addUser;
    @FXML private TextField addName;
    @FXML private PasswordField addPass;
    @FXML private TextArea cosoleField;
    @FXML private ComboBox<String> removeUser;
    @FXML private TreeView<String> treeView = new TreeView<String>();
    private LinuxCommand commands = new LinuxCommand();

    @FXML protected void lsCommand(ActionEvent event) throws IOException, InterruptedException {
      commands.lsCommand(treeView);
    }
    @FXML protected void lslsCommand(ActionEvent event) {
  }
    @FXML protected void lslstCommand(ActionEvent event) {
  }
    @FXML protected void addUserCMD(ActionEvent event) throws IOException, InterruptedException {
    	commands.addUserCMD(cosoleField ,addUser , addName , addPass);
  }
    @FXML protected void removeUserCMD(ActionEvent event) throws IOException, InterruptedException {
    	commands.seeAllUsers(removeUser);
  }


    
}

