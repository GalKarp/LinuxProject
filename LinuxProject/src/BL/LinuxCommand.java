package BL;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import javax.swing.JTree;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


public class LinuxCommand {

 
  public void lsCommand(TreeView<String> treeView) throws IOException, InterruptedException
  {
    try
    {
        Process p=Runtime.getRuntime().exec("ls");
        p.waitFor();
        BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line=reader.readLine();
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
  public void addUserCMD(ScrollBar scrollBar, final TextArea cosoleField, Button addUser, TextField addName, PasswordField addPass) throws IOException, InterruptedException
  {
    try{
       
//      ProcessBuilder pb = new ProcessBuilder("/home/galk/git/LinuxProject/LinuxProject/src/BL/addUser", " yael", " 12345");
//      Process p = pb.start();
//        Process p=Runtime.getRuntime().exec("pwd" );
        p.waitFor();
//        BufferedWriter writer=new BufferedWriter(new outputstre(p.getInputStream()));
       System.out.println(p.getOutputStream());
        BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line=reader.readLine();
        while(line!=null)
        {
        	System.out.println("1");
        	System.out.println(line);
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
public void seeAllUsers(ComboBox<String> removeUser) {
    try
    {
        Process p=Runtime.getRuntime().exec("/LinuxProject/src/BL/seeUser");
        p.waitFor();
        BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line=reader.readLine();
        while(line!=null)
        {
        	
            line=reader.readLine();
            removeUser.getItems().add(line);
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
