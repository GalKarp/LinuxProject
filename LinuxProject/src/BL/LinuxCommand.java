package BL;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class LinuxCommand {

	private JTextArea textArea;
	  // can run basic ls or ps commands
	  // can run command pipelines
	  // can run sudo command if you know the password is correct
	  public LinuxCommand() throws IOException, InterruptedException
	  {
		  textArea = new JTextArea();
//	    // build the system command we want to run
//	    List<String> commands = new ArrayList<String>();
//	    commands.add("/bin/sh");
//	    commands.add("-c");
//	    commands.add("cut -d : -f 1 /etc/passwd");
////	    commands.add("ls -l /var/tmp | grep tmp");
//
//	    // execute the command
//	    SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
//	    int result = commandExecutor.executeCommand();
//
//	    // get the stdout and stderr from the command that was run
//	    StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
//	    StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
//	    
//	    // print the stdout and stderr
//	    System.out.println("The numeric result of the command was: " + result);
//	    System.out.println("STDOUT:");
//	    System.out.println(stdout);
//	    System.out.println("STDERR:");
//	    System.out.println(stderr);
	  }

	public void RemoveUser(JComboBox comboBox) {
        String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("cut -d : -f 1 /etc/passwd");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            comboBox.addItem(s);	
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
    }
	public void sysInfo( ) {
//        String s;
//        Process p;
    	new Thread(new Runnable() {
		    @Override
		    public void run() {
		        try {
		            String s;
		            Process p;
		            textArea.setText("");
		            p = Runtime.getRuntime().exec("lshw");
		            BufferedReader br = new BufferedReader(
		                new InputStreamReader(p.getInputStream()));
		            while ((s = br.readLine()) != null){
		            	System.out.println (s);
		            	textArea.append(s + "\n");	
		            }
		            p.waitFor();
		            System.out.println ("exit: " + p.exitValue());
		            p.destroy();
		        } catch (Exception e) {}
			            
		    }
		}).start();
    }
	public void seeProcess( ) {
        String s;
        Process p;
        textArea.setText("");
        try {
            p = Runtime.getRuntime().exec("ps -ef");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            	textArea.append(s + "\n");
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
    }
	public void grepString(JTextField grep) throws IOException, InterruptedException {

        textArea.setText("");
	    List<String> commands = new ArrayList<String>();
	    commands.add("/bin/sh");
	    commands.add("-c");
	    commands.add("grep -r "+grep.getText()+" ~/");
	    // execute the command
	    SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
	    int result = commandExecutor.executeCommand();
	    StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
	    textArea.append(stdout + "\n");	
    }
	public void AddUser(JTextField text, JPasswordField passwordField) throws IOException, InterruptedException {

//        textArea.setText("");
//	    List<String> commands = new ArrayList<String>();
//	    commands.add("/bin/sh");
//	    commands.add("-c");
//	    commands.add("sudo su");
////	    commands.add("adduser " + text.getText());
////	    commands.add("echo "+ passwordField.getText()+" | passwd "+ text.getText()+" --stdin");
//	    commands.add("echo -e \"$"+passwordField.getText()+"\n$"+passwordField.getText()+"\n | sudo passwd $"+text.getText());
//	    		
//	    // execute the command
//	    SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
//	    int result = commandExecutor.executeCommand();
//	    StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
//	    textArea.append(stdout + "\n");	
////	    // get the stdout and stderr from the command that was run
//	    StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
////	    
////	    // print the stdout and stderr
//	    System.out.println("The numeric result of the command was: " + result);
//	    System.out.println("STDOUT:");
//	    System.out.println(stdout);
//	    System.out.println("STDERR:");
//	    System.out.println(stderr);
    	new Thread(new Runnable() {
		    @Override
		    public void run() {
		        try {
		            textArea.setText("");
		    	    List<String> commands = new ArrayList<String>();
		    	    commands.add("/bin/sh");
		    	    commands.add("-c");
		    	    commands.add("sudo adduser "+text.getText());
		    	    commands.add("echo -e "+passwordField.getText()+"\"\n\""+passwordField.getText()+" | sudo passwd "+text.getText());
//		    	    commands.add("usermod --password "+passwordField.getText() +" "+text.getText());

//		    	    echo -e $i"\n"$i|sudo -S passwd sampleuser
//		    	    Runtime.getRuntime().exec("sudo su");
//		    	    commands.add("echo -e \"$"+passwordField.getText()+"\n$"+passwordField.getText()+"\" | sudo adduser "+text.getText());
//		    	    commands.add("echo \""+text.getText()+":"+passwordField.getText()+ "\" | chpasswd");

//		    	    sudo useradd -s /bin/bash -m -d /home/$1 --user-group $1 
//		    	    echo -e "$2\n$2" | passwd $1
//		    	    commands.add("adduser " + text.getText());
//		    	    Process p = Runtime.getRuntime().exec("echo "+ passwordField.getText()+" | passwd "+ text.getText()+" --stdin");
//		    	   Process p = Runtime.getRuntime().exec("echo -e \"$"+passwordField.getText()+"\n$"+passwordField.getText()+"\" | sudo -S passwd "+text.getText());
////		    	   Process p = Runtime.getRuntime().exec("adduser " + text.getText());
//
//		    	    "sudo adduser"+ text.getText()+ "--gecos"+"/"First Last,RoomNumber,WorkPhone,HomePhone/""+" --disabled-password"
//		    	    echo "myuser:password" | sudo chpasswd
//		            p.waitFor();
//		            System.out.println ("exit: " + p.exitValue());
//		            p.destroy();
		    	    	
		    	    // execute the command
		    	    SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
		    	    int result = commandExecutor.executeCommand();
		    	    StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
		    	    textArea.append(stdout + "\n");	
//		    	    // get the stdout and stderr from the command that was run
		    	    StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
//		    	    
//		    	     print the stdout and stderr
		    	    System.out.println("The numeric result of the command was: " + result);
		    	    System.out.println("STDOUT:");
		    	    System.out.println(stdout);
		    	    System.out.println("STDERR:");
		    	    System.out.println(stderr);
		    	    

		        } catch (Exception e) {}
			            
		    }
		}).start();
//	  }
	    
    }

	public void setArea(JTextArea textArea) {
		this.textArea = textArea;
		
	}

	public void pwdCommand(JTextPane textPane_1) {
        String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("pwd");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            	textPane_1.setText(s);
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
		
	}
	
	public void lslCommand() {
        String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("ls -ls");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            	textArea.setText(s);
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
		
	}

	public void cdCommand(JTextField cdField) throws IOException, InterruptedException {
//        textArea.setText("");
	    List<String> commands = new ArrayList<String>();
	    commands.add("#!/usr/bin/perl");
//	    commands.add("-c");
	    commands.add("chdir('/home/galk')");
	    // execute the command
	    SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
	    int result = commandExecutor.executeCommand();
	    // get the stdout and stderr from the command that was run
	    StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
	    StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
	    
	    // print the stdout and stderr
	    System.out.println("The numeric result of the command was: " + result);
	    System.out.println("STDOUT:");
	    System.out.println(stdout);
	    System.out.println("STDERR:");
	    System.out.println(stderr);	
		
	}

	public void lslstCommand() {
		String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("ls -lst");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            	textArea.setText(s);
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
		
	}

	public void mvCommand(JTextField mvTextField_1, JTextField mvTextField_2) {
		String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("mv "+mvTextField_1.getText()+" "+mvTextField_2.getText());
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            	textArea.setText(s);
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
		
	}

	public void cpCommand(JTextField cpTextField_1, JTextField cpTextField_2) {
		String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("cp "+cpTextField_1.getText()+" "+cpTextField_2.getText());
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            	textArea.setText(s);
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
		
	}

	public void lnCommand(JTextField lnTextField_1, JTextField lnTextField_2) {
		String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("/home/lior/./ln.pl "+lnTextField_1.getText()+" "+lnTextField_2.getText());
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            	textArea.setText(s);
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
		
	}
	public void lnsCommand(JTextField lnsTextField_1, JTextField lnsTextField_2) {
		String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("/home/lior/./lns.pl "+lnsTextField_1.getText()+" "+lnsTextField_2.getText());
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null){
            	textArea.setText(s);
            }
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
		
	}
		
	
}
