package BL;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.SpringLayout;
import javax.swing.JScrollBar;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JList;
import javax.swing.JTextArea;


public class GUI extends JFrame {
	private JTextField find;
	private JTextField grep;
	private JTextField txtEnterName;
	private LinuxCommand commands;
	private JPasswordField passwordField;
	private JTextField cdField;
	
	public GUI() throws IOException, InterruptedException {
	    commands = new LinuxCommand();
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JButton btnLs = new JButton("ls");
		springLayout.putConstraint(SpringLayout.NORTH, btnLs, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnLs, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnLs);

		
		JButton btnLsl = new JButton("ls -ls");
		springLayout.putConstraint(SpringLayout.NORTH, btnLsl, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnLsl, 6, SpringLayout.EAST, btnLs);
//		springLayout.putConstraint(SpringLayout.EAST, btnLsl, 0, SpringLayout.EAST, btnShowSystemInfo);
		getContentPane().add(btnLsl);
		
		JButton btnLslst = new JButton("ls -lst");
		springLayout.putConstraint(SpringLayout.NORTH, btnLslst, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnLslst, 6, SpringLayout.EAST, btnLsl);
//		springLayout.putConstraint(SpringLayout.WEST, btnLslst, 6, SpringLayout.EAST, btnLsl);
		getContentPane().add(btnLslst);
		
		JButton btnGrep = new JButton("Find");
		springLayout.putConstraint(SpringLayout.EAST, btnLs, 0, SpringLayout.EAST, btnGrep);
		springLayout.putConstraint(SpringLayout.NORTH, btnGrep, 578, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnGrep, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnGrep);
		
		JButton btnNewButton = new JButton("Grep");
		springLayout.putConstraint(SpringLayout.SOUTH, btnGrep, -6, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 619, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -1089, SpringLayout.EAST, getContentPane());

		getContentPane().add(btnNewButton);
		
		find = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, btnLslst, -16, SpringLayout.EAST, find);
		springLayout.putConstraint(SpringLayout.WEST, find, 91, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnGrep, -6, SpringLayout.WEST, find);
		find.setText("  Enter String");
		getContentPane().add(find);
		find.setColumns(10);
		
		grep = new JTextField();
		grep.setText("  Enter String");
		springLayout.putConstraint(SpringLayout.SOUTH, find, -6, SpringLayout.NORTH, grep);
		springLayout.putConstraint(SpringLayout.EAST, find, 0, SpringLayout.EAST, grep);
		springLayout.putConstraint(SpringLayout.NORTH, grep, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, grep, 6, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, grep, 0, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, grep, -890, SpringLayout.EAST, getContentPane());
		getContentPane().add(grep);
		grep.setColumns(10);
		
		JButton btnAddUser = new JButton("Add user");
		springLayout.putConstraint(SpringLayout.EAST, btnAddUser, 0, SpringLayout.EAST, btnLs);
		getContentPane().add(btnAddUser);
		
		txtEnterName = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtEnterName, 0, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.WEST, txtEnterName, 6, SpringLayout.EAST, btnAddUser);
		txtEnterName.setText("   Enter Name");
		getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
		
		JButton btnRemoveUser = new JButton("Remove User");
		springLayout.putConstraint(SpringLayout.SOUTH, btnAddUser, -6, SpringLayout.NORTH, btnRemoveUser);
		springLayout.putConstraint(SpringLayout.WEST, btnRemoveUser, 0, SpringLayout.WEST, btnLs);
		getContentPane().add(btnRemoveUser);
		
		JComboBox comboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, btnRemoveUser);
		getContentPane().add(comboBox);
		
		JRadioButton rdbtnDirectory = new JRadioButton("Directory");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnDirectory, 0, SpringLayout.NORTH, btnGrep);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnDirectory, 6, SpringLayout.EAST, find);
		getContentPane().add(rdbtnDirectory);
		

		

		
		
		
		
		JSeparator separator = new JSeparator();
		springLayout.putConstraint(SpringLayout.SOUTH, btnRemoveUser, -6, SpringLayout.NORTH, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox, -6, SpringLayout.NORTH, separator);
		springLayout.putConstraint(SpringLayout.NORTH, separator, 570, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, find, 6, SpringLayout.SOUTH, separator);
		springLayout.putConstraint(SpringLayout.WEST, separator, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, separator, -6, SpringLayout.NORTH, btnGrep);
		springLayout.putConstraint(SpringLayout.EAST, separator, 788, SpringLayout.WEST, getContentPane());
		getContentPane().add(separator);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 262, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtEnterName, -6, SpringLayout.WEST, passwordField);
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 0, SpringLayout.NORTH, btnAddUser);
		passwordField.setToolTipText("Password");
		getContentPane().add(passwordField);
		
		JSeparator separator_1 = new JSeparator();
		springLayout.putConstraint(SpringLayout.NORTH, btnAddUser, 6, SpringLayout.SOUTH, separator_1);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, 43, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.SOUTH, txtEnterName, 43, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.NORTH, btnRemoveUser, 47, SpringLayout.SOUTH, separator_1);
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 47, SpringLayout.SOUTH, separator_1);
		springLayout.putConstraint(SpringLayout.SOUTH, separator_1, -183, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, separator_1, 479, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, separator_1, 0, SpringLayout.WEST, separator);
		springLayout.putConstraint(SpringLayout.EAST, separator_1, 708, SpringLayout.WEST, getContentPane());
		getContentPane().add(separator_1);
		
		JButton btnShowSystemInfo = new JButton("Show System Info");
		springLayout.putConstraint(SpringLayout.WEST, btnShowSystemInfo, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnLsl, 0, SpringLayout.EAST, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.NORTH, btnShowSystemInfo, -45, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnShowSystemInfo, -6, SpringLayout.NORTH, separator_1);
		getContentPane().add(btnShowSystemInfo);
		
		JButton btnShowProcess = new JButton("Show Process");
		springLayout.putConstraint(SpringLayout.NORTH, btnShowProcess, -45, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.WEST, btnShowProcess, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnShowProcess, -6, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.EAST, btnShowProcess, 0, SpringLayout.EAST, btnShowSystemInfo);
		getContentPane().add(btnShowProcess);
		

		
		JButton btnMv = new JButton("mv");
		springLayout.putConstraint(SpringLayout.NORTH, btnMv, 52, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnMv, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnMv, -301, SpringLayout.NORTH, btnShowProcess);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLs, -6, SpringLayout.NORTH, btnMv);
		getContentPane().add(btnMv);
		
		JComboBox comboBox_1 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox_1, 52, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, comboBox_1, 91, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox_1, -301, SpringLayout.NORTH, btnShowProcess);
		springLayout.putConstraint(SpringLayout.EAST, btnMv, -6, SpringLayout.WEST, comboBox_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLslst, -6, SpringLayout.NORTH, comboBox_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLsl, -6, SpringLayout.NORTH, comboBox_1);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		springLayout.putConstraint(SpringLayout.WEST, comboBox_2, 223, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, comboBox_1, -6, SpringLayout.WEST, comboBox_2);
		springLayout.putConstraint(SpringLayout.NORTH, comboBox_2, 6, SpringLayout.SOUTH, btnLslst);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox_2, 0, SpringLayout.SOUTH, btnMv);
		getContentPane().add(comboBox_2);
		
		JButton btnPwd = new JButton("pwd");
		springLayout.putConstraint(SpringLayout.WEST, btnPwd, 521, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnPwd, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnPwd, -433, SpringLayout.NORTH, separator_1);
		btnPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btnPwd);
		
		JTextPane textPane_1 = new JTextPane();
		springLayout.putConstraint(SpringLayout.WEST, textPane_1, 607, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textPane_1, -10, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnPwd, -6, SpringLayout.WEST, textPane_1);
		springLayout.putConstraint(SpringLayout.NORTH, textPane_1, 10, SpringLayout.NORTH, getContentPane());
		getContentPane().add(textPane_1);
		
		JLabel lblNewLabel = new JLabel("              Console");
		springLayout.putConstraint(SpringLayout.EAST, comboBox_2, -497, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 52, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -577, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textPane_1, -6, SpringLayout.NORTH, lblNewLabel);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, -330, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -209, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JTree tree = new JTree();
		springLayout.putConstraint(SpringLayout.NORTH, tree, 329, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, tree, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnShowSystemInfo, -725, SpringLayout.WEST, tree);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -477, SpringLayout.WEST, tree);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -612, SpringLayout.WEST, tree);
		springLayout.putConstraint(SpringLayout.WEST, tree, -278, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tree, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(tree);
		
		JLabel lblFileView = new JLabel("           File View");
		springLayout.putConstraint(SpringLayout.NORTH, lblFileView, 237, SpringLayout.SOUTH, textPane_1);
		springLayout.putConstraint(SpringLayout.WEST, lblFileView, -192, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblFileView, -6, SpringLayout.NORTH, tree);
		springLayout.putConstraint(SpringLayout.EAST, lblFileView, -95, SpringLayout.EAST, getContentPane());
		lblFileView.setBackground(SystemColor.activeCaption);
		getContentPane().add(lblFileView);
		setSize(1180, 693);
		setResizable(false);
		setVisible(true);
		
		commands.RemoveUser(comboBox);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, panel, -571, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, lblFileView);
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		commands.setArea(textArea);
		scrollPane.setViewportView(textArea);
		
		JButton cdBtn = new JButton("cd");
		springLayout.putConstraint(SpringLayout.NORTH, cdBtn, 6, SpringLayout.SOUTH, btnMv);
		springLayout.putConstraint(SpringLayout.WEST, cdBtn, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, cdBtn, 42, SpringLayout.SOUTH, btnMv);
		springLayout.putConstraint(SpringLayout.EAST, cdBtn, 85, SpringLayout.WEST, getContentPane());
		getContentPane().add(cdBtn);
		
		cdField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, cdField, 6, SpringLayout.SOUTH, comboBox_1);
		springLayout.putConstraint(SpringLayout.WEST, cdField, 6, SpringLayout.EAST, cdBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, cdField, 0, SpringLayout.SOUTH, cdBtn);
		springLayout.putConstraint(SpringLayout.EAST, cdField, -11, SpringLayout.EAST, btnPwd);
		getContentPane().add(cdField);
		cdField.setColumns(10);

		btnShowProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.seeProcess();

			}
		});
		btnShowSystemInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.sysInfo();

			}
		});
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					commands.AddUser(txtEnterName,passwordField);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					commands.grepString(grep);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.pwdCommand(textPane_1);
			}
		});
		cdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					commands.cdCommand(cdField);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
}
