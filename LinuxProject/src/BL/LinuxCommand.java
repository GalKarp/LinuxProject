package BL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


public class LinuxCommand {

 
  public void lsCommand(TreeView<String> treeView) throws IOException, InterruptedException
  {
    try
    {
        Process p=Runtime.getRuntime().exec("ls" );
        p.waitFor();
        BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line=reader.readLine();
      TreeItem<String> root = new TreeItem<String>("Root Node");
      root.setExpanded(true);
        while(line!=null)
        {
        	root.getChildren().add(new TreeItem<String>(line));
            line=reader.readLine();
        }
        treeView.setRoot(root);
    }
    catch(IOException e1) {
        System.out.println("Pblm found1.");
    }
    catch(InterruptedException e2) {
        System.out.println("Pblm found2.");
    }

    System.out.println("finished.");
  }
  public void addUserCMD(TextArea cosoleField, Button addUser, TextField addName, PasswordField addPass) throws IOException, InterruptedException
  {
    try
    {
        Process p=Runtime.getRuntime().exec("/LinuxProject/src/BL/addUser " + addName +" " + addPass );
        p.waitFor();
        BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line=reader.readLine();
        while(line!=null)
        {
        	
            line=reader.readLine();
            cosoleField.setText(line);
        }
    }
    catch(IOException e1) {
        System.out.println("Pblm found1.");
    }
    catch(InterruptedException e2) {
        System.out.println("Pblm found2.");
    }

    System.out.println("finished.");
  }

}
