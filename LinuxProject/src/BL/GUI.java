package BL;
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
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.SpringLayout;


public class GUI extends JFrame {
	private JTextField find;
	private JTextField grep;
	private JTextField txtEnterName;
	private LinuxCommand commands;
	private JPasswordField passwordField;
	
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
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
		
		JTextPane textPane = new JTextPane();
		springLayout.putConstraint(SpringLayout.SOUTH, textPane, -446, SpringLayout.SOUTH, btnNewButton);
		getContentPane().add(textPane);
		
		JButton btnAddUser = new JButton("Add user");
		springLayout.putConstraint(SpringLayout.EAST, btnAddUser, 0, SpringLayout.EAST, btnLs);
		getContentPane().add(btnAddUser);
		
		txtEnterName = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtEnterName, 0, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.WEST, txtEnterName, 0, SpringLayout.WEST, find);
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton, -425, SpringLayout.SOUTH, getContentPane());
		getContentPane().add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnR = new JRadioButton("R");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnR, 134, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnR, -495, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 35, SpringLayout.SOUTH, rdbtnR);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnR, 183, SpringLayout.WEST, getContentPane());
		getContentPane().add(rdbtnR);
		

		

		
		
		
		
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
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 0, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 6, SpringLayout.EAST, txtEnterName);
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
		springLayout.putConstraint(SpringLayout.EAST, btnLsl, 0, SpringLayout.EAST, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.NORTH, btnShowSystemInfo, -45, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.WEST, btnShowSystemInfo, 10, SpringLayout.WEST, getContentPane());
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
		springLayout.putConstraint(SpringLayout.EAST, btnMv, -6, SpringLayout.WEST, comboBox_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLslst, -6, SpringLayout.NORTH, comboBox_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLsl, -6, SpringLayout.NORTH, comboBox_1);
		springLayout.putConstraint(SpringLayout.NORTH, comboBox_1, 6, SpringLayout.SOUTH, btnLs);
		springLayout.putConstraint(SpringLayout.WEST, comboBox_1, 0, SpringLayout.WEST, find);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox_1, -46, SpringLayout.NORTH, rdbtnR);
		springLayout.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, rdbtnR);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox_2, 6, SpringLayout.SOUTH, btnLslst);
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
		springLayout.putConstraint(SpringLayout.WEST, textPane, 0, SpringLayout.WEST, textPane_1);
		springLayout.putConstraint(SpringLayout.EAST, textPane, 0, SpringLayout.EAST, textPane_1);
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
		springLayout.putConstraint(SpringLayout.SOUTH, tree, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -477, SpringLayout.WEST, tree);
		springLayout.putConstraint(SpringLayout.EAST, txtEnterName, -644, SpringLayout.WEST, tree);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -612, SpringLayout.WEST, tree);
		springLayout.putConstraint(SpringLayout.EAST, btnShowSystemInfo, -725, SpringLayout.WEST, tree);
		springLayout.putConstraint(SpringLayout.WEST, tree, -278, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tree, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(tree);
		
		JLabel lblFileView = new JLabel("           File View");
		springLayout.putConstraint(SpringLayout.NORTH, lblFileView, 168, SpringLayout.SOUTH, textPane_1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFileView, -412, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, tree, 6, SpringLayout.SOUTH, lblFileView);
		springLayout.putConstraint(SpringLayout.WEST, lblFileView, -180, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblFileView, -83, SpringLayout.EAST, getContentPane());
		lblFileView.setBackground(SystemColor.activeCaption);
		getContentPane().add(lblFileView);
		setSize(1180, 693);
		setResizable(false);
		setVisible(true);
	}
}
