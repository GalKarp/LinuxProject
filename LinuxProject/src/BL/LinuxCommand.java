package BL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class LinuxCommand {

	private JTextArea textArea;

	public LinuxCommand() throws IOException, InterruptedException {
		textArea = new JTextArea();
	}

	public void RemoveUser(JComboBox comboBox) {
		String s;
		Process p;
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
		} catch (Exception e) {
		}
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
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec("pwd");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((s = br.readLine()) != null) {
				textPane_1.setText(s);
			}
			p.waitFor();
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {
		}

	}

	public void lslCommand() {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec("ls -ls");
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

	public void cdCommand(JTextField cdField) throws IOException,
			InterruptedException {

	}

	public void lslstCommand() {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec("ls -lst");
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

	public void mvCommand(JTextField mvTextField_1, JTextField mvTextField_2) {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec(
					"mv " + mvTextField_1.getText() + " "
							+ mvTextField_2.getText());
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

	public void cpCommand(JTextField cpTextField_1, JTextField cpTextField_2) {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec(
					"cp " + cpTextField_1.getText() + " "
							+ cpTextField_2.getText());
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

	public void lnCommand(JTextField lnTextField_1, JTextField lnTextField_2) {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/./ln.pl " + lnTextField_1.getText() + " "
							+ lnTextField_2.getText());
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

	public void lnsCommand(JTextField lnsTextField_1, JTextField lnsTextField_2) {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/./lns.pl " + lnsTextField_1.getText() + " "
							+ lnsTextField_2.getText());
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

	public void moreCommand(JTextField moreTextField_1,
			JTextField moreTextField_2) {
		String s;
		Process p;
		textArea.setText(null);
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/git/LinuxProject/LinuxProject/./mo.pl "
							+ moreTextField_1.getText() + " "
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

	public void suCommand(JTextField suTextField) {
		String s;
		Process p;
		try {
			System.out.println("bla");
			p = Runtime.getRuntime().exec(
					"export SUDO_ASKPASS=/home/lior/pass.sh | sudo -A su");
			System.out.println("bla");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));
			while ((s = br.readLine()) != null) {
				textArea.setText(s);
			}
			p.waitFor();
			System.out.println("bla");
			System.out.println("exit: " + p.exitValue());
			p.destroy();
		} catch (Exception e) {
		}
		// try {
		// p = Runtime.getRuntime().exec("sudo -A su");
		// BufferedReader br = new BufferedReader(
		// new InputStreamReader(p.getErrorStream()));
		// while ((s = br.readLine()) != null){
		// textArea.setText(s);
		// }
		// p.waitFor();
		// System.out.println ("exit: " + p.exitValue());
		// p.destroy();
		// } catch (Exception e) {}

	}

	public void exitSuCommand() {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec("exit");
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

	public void setDateCommand(JTextField dateTextField) {
		String s;
		Process p;
		try {
			p = Runtime.getRuntime().exec(
					"sudo -S date -s " + dateTextField.getText()
							+ " | echo 508810");
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
					"/home/lior/git/LinuxProject/LinuxProject/./lsperl.pl");
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

	public void chmodCommand(JTextField chmodTextField) {
		String s;
		Process p;
		textArea.setText(null);
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/git/LinuxProject/LinuxProject/./chmodPerl.pl "
							+ chmodTextField.getText());
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

	public void sedCommand(JTextField sedTextField_1,
			JTextField sedTextField_2, JTextField sedTextField_3) {
		String s;
		Process p;
		textArea.setText(null);
		try {
			p = Runtime.getRuntime().exec(
					"/home/lior/git/LinuxProject/LinuxProject/./sedScript.pl "
							+ sedTextField_1.getText() + " "
							+ sedTextField_2.getText() + " "
							+ sedTextField_3.getText());
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

}
