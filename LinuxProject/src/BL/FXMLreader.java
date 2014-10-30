package BL;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class FXMLreader   {
    @FXML private Button ls;
    @FXML private TreeView<String> treeView = new TreeView<String>();
    private LinuxCommand commands = new LinuxCommand();

    @FXML protected void lsCommand(ActionEvent event) throws IOException, InterruptedException {
      commands.lsCommand(treeView);
    }
    @FXML protected void lslsCommand(ActionEvent event) {
  }
    @FXML protected void lslstCommand(ActionEvent event) {
  }


    
}

