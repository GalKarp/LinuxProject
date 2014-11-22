package BL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class LinuxCommand {

	private JTextArea textArea;
	private String currentLocation = "/home/lior";
	private String selectedItem;
	@SuppressWarnings("unused")
	private JComboBox<String> comboBox;

	public LinuxCommand() throws IOException, InterruptedException {
		textArea = new JTextArea();
	}

	public void RemoveUser(JComboBox<String> comboBox) {
		String s;
		Process p;
		//		this.comboBox = comboBox;
		//		selectedItem = (String)comboBox.getSelectedItem();
		try {
			p = Runtime.getRuntime().exec("cut -d : -f 1 /etc/passwd");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				comboBox.addItem(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();


		} catch (Exception e) {}
	}
	void remove(JComboBox<?> comboBox) {

		new Thread(new Runnable() {
			public void run() {
				try {
					selectedItem = (String)comboBox.getSelectedItem();
					String s;
					Process p;
					textArea.setText("");
					System.out.println(selectedItem);
					if(selectedItem != "root"){
						p = Runtime.getRuntime().exec("sudo userdel " + selectedItem);

						BufferedReader br = new BufferedReader(
								new InputStreamReader(p.getInputStream()));
						while ((s = br.readLine()) != null) {
							System.out.println(s);
							textArea.append(s + "\n");
						}
						p.waitFor();
						System.out.println("exit: " + p.exitValue());
						p.destroy();
						comboBox.removeAllItems();
					}
				} catch (Exception e) {
				}

			}
		}).start();

	}

	public void sysInfo() {
		new Thread(new Runnable() {
			public void run() {
				try {
					String s;
					Process p;
					textArea.setText("");
					p = Runtime.getRuntime().exec("lshw");
					BufferedReader br = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
					while ((s = br.readLine()) != null) {
						System.out.println(s);
						textArea.append(s + "\n");
					}
					p.waitFor();
					System.out.println("exit: " + p.exitValue());
					p.destroy();
				} catch (Exception e) {
				}

			}
		}).start();
	}

	public void seeProcess() {
		String s;
		Process p;
		textArea.setText("");
		try {
			p = Runtime.getRuntime().exec("ps -ef");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.append(s + "\n");
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {
		}
	}

	public void grepString(JTextField grep) throws IOException,
	InterruptedException {
		new Thread(new Runnable() {
			public void run() {
				try {
					String s;
					Process p;
					p = Runtime.getRuntime().exec("/home/lior/git/LinuxProject/LinuxProject/./grepScript.pl "+grep.getText());
					BufferedReader br = new BufferedReader(new InputStreamReader(
							p.getInputStream()));
					while ((s = br.readLine()) != null) {
						textArea.append(s+"\n");
					}
					p.waitFor();
					System.out.println("exit: " + p.exitValue());
					p.destroy();
				} catch (Exception e) {}
			}
		}).start();
	}

	public void AddUser(JTextField userName, JPasswordField passwordField)
			throws IOException, InterruptedException {

		new Thread(new Runnable() {
			public void run() {
				try {
					String s;
					Process p;
					p = Runtime.getRuntime().exec("sudo adduser " + userName.getText());
					BufferedReader br = new BufferedReader(new InputStreamReader(
							p.getInputStream()));
					while ((s = br.readLine()) != null) {
						textArea.append(s+"\n");
					}
					p.waitFor();
					System.out.println("exit: " + p.exitValue());
					p.destroy();
					attachPassword(userName, passwordField);

				} catch (Exception e) {
				}

			}
		}).start();

	}

	protected void attachPassword(JTextField userName, JPasswordField passwordField) {
		new Thread(new Runnable() {
			@SuppressWarnings("deprecation")
			public void run() {
				try {
					String s;
					Process p;
					p = Runtime.getRuntime().exec("/home/lior/git/LinuxProject/LinuxProject/./attachPass "+userName.getText()+" "+passwordField.getText());
					BufferedReader br = new BufferedReader(new InputStreamReader(
							p.getInputStream()));
					while ((s = br.readLine()) != null) {
						textArea.append(s+"\n");
					}
					p.waitFor();
					System.out.println("exit: " + p.exitValue());
					p.destroy();
				} catch (Exception e) {}
			}
		}).start();
	}

	public void setArea(JTextArea textArea) {
		this.textArea = textArea;

	}

	public void pwdCommand(JTextPane textPane_1) {
		textPane_1.setText(currentLocation);
	}

	public void lslCommand() {
		String s;
		Process p;
		textArea.setText(null);
		try {
			p = Runtime.getRuntime().exec("ls -ls "+currentLocation);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.append(s+"\n");
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {}
	}

	public void cdCommand(JTextField cdField){
		textArea.setText(null);
		String newPath = buildPath(cdField.getText());
		Path path = Paths.get(newPath);
		if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)){
			setCurrentLocation(newPath);
		}
		else textArea.setText("Incorrect path");
	}

	public String buildPath(String newPath){
		String[] folders = currentLocation.split("/");
		if(newPath.equals("..")){
			if(folders.length>2){
				newPath = "";
				for(int i = 1; i < folders.length-1; i++){
					newPath += "/" + folders[i];
				}
			}
			else{
				newPath = currentLocation;
			}
		}
		else if(!newPath.startsWith("/")){
			newPath = currentLocation+"/"+newPath;
		}
		return newPath;
	}

	public void lslstCommand() {
		String s;
		Process p;
		textArea.setText(null);
		try {
			p = Runtime.getRuntime().exec("ls -lst "+ currentLocation);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.append(s+"\n");
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public void mvCommand(JTextField mvTextField_1, JTextField mvTextField_2) {
		String s;
		Process p;
		String originalPath = buildPath(mvTextField_1.getText());
		String destPath = buildPath(mvTextField_2.getText());
		try {
			p = Runtime.getRuntime().exec(
					"mv " + originalPath + " "
							+ destPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public void cpCommand(JTextField cpTextField_1, JTextField cpTextField_2) {
		String s;
		Process p;
		String originalPath = buildPath(cpTextField_1.getText());
		String destPath = buildPath(cpTextField_2.getText());
		try {
			p = Runtime.getRuntime().exec(
					"cp " + originalPath + " "
							+ destPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public void lnCommand(JTextField lnTextField_1, JTextField lnTextField_2) {
		String s;
		Process p;
		String originalPath = buildPath(lnTextField_1.getText());
		String destPath = buildPath(lnTextField_2.getText());
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/./ln.pl " + originalPath + " "
							+ destPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public void lnsCommand(JTextField lnsTextField_1, JTextField lnsTextField_2) {
		String s;
		Process p;
		String originalPath = buildPath(lnsTextField_1.getText());
		String destPath = buildPath(lnsTextField_2.getText());
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/./lns.pl " + originalPath + " "
							+ destPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public void moreCommand(JTextField moreTextField_1,
			JTextField moreTextField_2) {
		String s;
		Process p;
		String originalPath = buildPath(moreTextField_1.getText());
		textArea.setText(null);
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/git/LinuxProject/LinuxProject/./mo.pl "
							+ originalPath + " "
							+ moreTextField_2.getText());
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.append(s + "\n");
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {
		}
	}

	public void setDateCommand(JComboBox<?> dateComboBox_1,JComboBox<?> dateComboBox_2,JComboBox<?> dateComboBox_3,JComboBox<?> timeComboBox_1,JComboBox<?> timeComboBox_2,JComboBox<?> timeComboBox_3) {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec("/home/lior/git/LinuxProject/LinuxProject/./setDate \"\""+
					dateComboBox_2.getSelectedItem().toString()+"/"+dateComboBox_1.getSelectedItem().toString()+"/"+dateComboBox_3.getSelectedItem().toString()+" "+
					timeComboBox_1.getSelectedItem().toString()+":"+timeComboBox_2.getSelectedItem().toString()+":"+timeComboBox_3.getSelectedItem().toString()+"\"\"");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {
		}
	}

	public void dateCommand() {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec("date");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {
		}
	}

	public void lsCommand() {
		String s;
		Process p;
		textArea.setText(null);
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/git/LinuxProject/LinuxProject/./lsperl.pl "+currentLocation);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.append(s + "\n");
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {
		}
	}

	public void chmodCommand(JTextField chmodTextField, ButtonGroup group) {
		String s;
		Process p = null;
		String originalPath = buildPath(chmodTextField.getText());
		textArea.setText(null);
		try {
			if(group.getSelection().getActionCommand().equals("Admin")){
				p = Runtime.getRuntime().exec("/home/lior/git/LinuxProject/LinuxProject/./chmodAdmin.pl "+ originalPath);
			}
			else if(group.getSelection().getActionCommand().equals("User")){
				p = Runtime.getRuntime().exec("/home/lior/git/LinuxProject/LinuxProject/./chmodUser.pl "+ originalPath);
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.append(s + "\n");
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public void sedCommand(JTextField sedTextField_1,
			JTextField sedTextField_2, JTextField sedTextField_3) {
		String s;
		Process p;
		String originalPath = buildPath(sedTextField_3.getText());
		textArea.setText(null);
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/git/LinuxProject/LinuxProject/./sedScript.pl "
							+ sedTextField_1.getText() + " "
							+ sedTextField_2.getText() + " "
							+ originalPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.append(s + "\n");
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public void backupCommand(JTextField recoveBackupTextField_1,
			JTextField recoveBackupTextField_2) {
		String s;
		Process p;
		String originalPath = buildPath(recoveBackupTextField_1.getText());
		String destPath = buildPath(recoveBackupTextField_2.getText());
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/git/LinuxProject/LinuxProject/./backupSpt " + destPath + " "
							+ originalPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public void recoverCommand(JTextField recoveBackupTextField_1,
			JTextField recoveBackupTextField_2) {
		String s;
		Process p;
		String originalPath = buildPath(recoveBackupTextField_1.getText());
		String destPath = buildPath(recoveBackupTextField_2.getText());
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/git/LinuxProject/LinuxProject/./recoverySpt " + originalPath + " "
							+ destPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {	}
	}

	public void findCommand(JTextField findTextField,
			JCheckBox chckbxDirectoryOnly) {
		new Thread(new Runnable() {
			public void run() {
				String s;
				Process p;
				textArea.setText(null);
				try {
					if(chckbxDirectoryOnly.isSelected()){
						p = Runtime.getRuntime().exec("/home/lior/git/LinuxProject/LinuxProject/./findDirSpt "+findTextField.getText());
					}
					else p = Runtime.getRuntime().exec("/home/lior/git/LinuxProject/LinuxProject/./findSpt "+findTextField.getText());
					BufferedReader br = new BufferedReader(new InputStreamReader(
							p.getInputStream()));
					while ((s = br.readLine()) != null) {
						textArea.append(s+"\n");
					}
					p.waitFor();
					System.out.println("exit: " + p.exitValue());
					p.destroy();
				} catch (Exception e) {	}
			}
		}).start();
		textArea.append("Done Finding");
	}

}
