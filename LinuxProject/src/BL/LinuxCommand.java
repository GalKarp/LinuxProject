package BL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;


public class LinuxCommand {

		
	  // can run basic ls or ps commands
	  // can run command pipelines
	  // can run sudo command if you know the password is correct
	  public LinuxCommand() throws IOException, InterruptedException
	  {
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
		
	
}
