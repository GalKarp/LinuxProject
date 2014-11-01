package BL;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTree;


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
		springLayout.putConstraint(SpringLayout.SOUTH, btnLs, -618, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnLs, -1089, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnLs);
		
		JButton btnGrep = new JButton("Find");
		springLayout.putConstraint(SpringLayout.NORTH, btnGrep, 532, SpringLayout.SOUTH, btnLs);
		springLayout.putConstraint(SpringLayout.WEST, btnGrep, 0, SpringLayout.WEST, btnLs);
		springLayout.putConstraint(SpringLayout.EAST, btnGrep, -1089, SpringLayout.EAST, getContentPane());
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
		find.setText("  Enter String");
		springLayout.putConstraint(SpringLayout.WEST, find, 6, SpringLayout.EAST, btnGrep);
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
		springLayout.putConstraint(SpringLayout.EAST, textPane, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(textPane);
		
		JButton btnAddUser = new JButton("Add user");
		springLayout.putConstraint(SpringLayout.NORTH, btnAddUser, 441, SpringLayout.SOUTH, btnLs);
		springLayout.putConstraint(SpringLayout.WEST, btnAddUser, 0, SpringLayout.WEST, btnLs);
		getContentPane().add(btnAddUser);
		
		txtEnterName = new JTextField();
		txtEnterName.setText("   Enter Name");
		springLayout.putConstraint(SpringLayout.NORTH, txtEnterName, 0, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.WEST, txtEnterName, 0, SpringLayout.WEST, find);
		springLayout.putConstraint(SpringLayout.SOUTH, txtEnterName, 0, SpringLayout.SOUTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.EAST, txtEnterName, 161, SpringLayout.WEST, find);
		getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
		
		JButton btnRemoveUser = new JButton("Remove User");
		springLayout.putConstraint(SpringLayout.SOUTH, btnAddUser, -6, SpringLayout.NORTH, btnRemoveUser);
		springLayout.putConstraint(SpringLayout.NORTH, btnRemoveUser, 528, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnRemoveUser, 0, SpringLayout.WEST, btnLs);
		getContentPane().add(btnRemoveUser);
		
		JComboBox comboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.NORTH, btnRemoveUser);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, btnRemoveUser);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, find);
		getContentPane().add(comboBox);
		
		JRadioButton rdbtnDirectory = new JRadioButton("Directory");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnDirectory, 0, SpringLayout.NORTH, btnGrep);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnDirectory, 6, SpringLayout.EAST, find);
		getContentPane().add(rdbtnDirectory);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("Directory");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 0, SpringLayout.WEST, radioButton);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnDirectory, 520, SpringLayout.NORTH, radioButton);
		springLayout.putConstraint(SpringLayout.NORTH, radioButton, 93, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, radioButton, 183, SpringLayout.WEST, getContentPane());
		getContentPane().add(radioButton);
		
		JRadioButton rdbtnR = new JRadioButton("R");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 35, SpringLayout.SOUTH, rdbtnR);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnR, 134, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, rdbtnR, 183, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnR, -359, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.SOUTH, radioButton, -6, SpringLayout.NORTH, rdbtnR);
		getContentPane().add(rdbtnR);
		
		JRadioButton rdbtnW = new JRadioButton("W");
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton, 105, SpringLayout.NORTH, rdbtnW);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnW, 6, SpringLayout.SOUTH, radioButton);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnW, -359, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnW, 6, SpringLayout.EAST, rdbtnR);
		getContentPane().add(rdbtnW);
		
		JRadioButton rdbtnX = new JRadioButton("X");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnX, 134, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, rdbtnW, -6, SpringLayout.WEST, rdbtnX);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnX, 270, SpringLayout.WEST, getContentPane());
		
		
		
		getContentPane().add(rdbtnX);
		
		JSeparator separator = new JSeparator();
		springLayout.putConstraint(SpringLayout.NORTH, find, 6, SpringLayout.SOUTH, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox, -6, SpringLayout.NORTH, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, btnRemoveUser, -6, SpringLayout.NORTH, separator);
		springLayout.putConstraint(SpringLayout.NORTH, separator, -8, SpringLayout.NORTH, btnGrep);
		springLayout.putConstraint(SpringLayout.WEST, separator, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, separator, -6, SpringLayout.NORTH, btnGrep);
		springLayout.putConstraint(SpringLayout.EAST, separator, 788, SpringLayout.WEST, getContentPane());
		getContentPane().add(separator);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password");
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 0, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 6, SpringLayout.EAST, txtEnterName);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 167, SpringLayout.EAST, txtEnterName);
		getContentPane().add(passwordField);
		
		JSeparator separator_1 = new JSeparator();
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnX, -310, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.NORTH, separator_1, -8, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.WEST, separator_1, 0, SpringLayout.WEST, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, separator_1, -6, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.EAST, separator_1, 708, SpringLayout.WEST, getContentPane());
		getContentPane().add(separator_1);
		
		JButton btnShowSystemInfo = new JButton("Show System Info");
		springLayout.putConstraint(SpringLayout.NORTH, btnShowSystemInfo, -45, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.WEST, btnShowSystemInfo, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnShowSystemInfo, -6, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.EAST, btnShowSystemInfo, 86, SpringLayout.EAST, btnLs);
		getContentPane().add(btnShowSystemInfo);
		
		JButton btnShowProcess = new JButton("Show Process");
		springLayout.putConstraint(SpringLayout.NORTH, btnShowProcess, -45, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.WEST, btnShowProcess, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnShowProcess, -6, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.EAST, btnShowProcess, 0, SpringLayout.EAST, btnShowSystemInfo);
		getContentPane().add(btnShowProcess);
		
		JButton btnLsl = new JButton("ls -ls");
		springLayout.putConstraint(SpringLayout.WEST, btnLsl, 91, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnLsl, -1003, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnLsl, 0, SpringLayout.NORTH, btnLs);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLsl, 0, SpringLayout.SOUTH, btnLs);
		getContentPane().add(btnLsl);
		
		JButton btnLslst = new JButton("ls -lst");
		springLayout.putConstraint(SpringLayout.NORTH, btnLslst, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnLslst, 0, SpringLayout.WEST, radioButton);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLslst, 36, SpringLayout.NORTH, btnLs);
		springLayout.putConstraint(SpringLayout.EAST, btnLslst, 0, SpringLayout.EAST, txtEnterName);
		getContentPane().add(btnLslst);
		
		JButton btnMv = new JButton("mv");
		springLayout.putConstraint(SpringLayout.NORTH, btnMv, 6, SpringLayout.SOUTH, btnLs);
		springLayout.putConstraint(SpringLayout.WEST, btnMv, 0, SpringLayout.WEST, btnLs);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMv, -302, SpringLayout.NORTH, btnShowProcess);
		springLayout.putConstraint(SpringLayout.EAST, btnMv, 0, SpringLayout.EAST, btnLs);
		getContentPane().add(btnMv);
		
		JComboBox comboBox_1 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox_1, 6, SpringLayout.SOUTH, btnLsl);
		springLayout.putConstraint(SpringLayout.WEST, comboBox_1, 0, SpringLayout.WEST, find);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox_1, -6, SpringLayout.NORTH, radioButton);
		springLayout.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, rdbtnR);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox_2, 6, SpringLayout.SOUTH, btnLslst);
		springLayout.putConstraint(SpringLayout.WEST, comboBox_2, 6, SpringLayout.EAST, comboBox_1);
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox_2, -6, SpringLayout.NORTH, radioButton);
		springLayout.putConstraint(SpringLayout.EAST, comboBox_2, 131, SpringLayout.EAST, comboBox_1);
		getContentPane().add(comboBox_2);
		
		JButton btnPwd = new JButton("pwd");
		btnPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnPwd, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnPwd, 269, SpringLayout.EAST, btnLslst);
		springLayout.putConstraint(SpringLayout.SOUTH, btnPwd, 46, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnPwd, 349, SpringLayout.EAST, btnLslst);
		getContentPane().add(btnPwd);
		
		JTextPane textPane_1 = new JTextPane();
		springLayout.putConstraint(SpringLayout.WEST, textPane, 0, SpringLayout.WEST, textPane_1);
		springLayout.putConstraint(SpringLayout.NORTH, textPane_1, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textPane_1, 6, SpringLayout.EAST, btnPwd);
		springLayout.putConstraint(SpringLayout.SOUTH, textPane_1, 0, SpringLayout.SOUTH, btnLs);
		springLayout.putConstraint(SpringLayout.EAST, textPane_1, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(textPane_1);
		
		JLabel lblNewLabel = new JLabel("              Console");
		springLayout.putConstraint(SpringLayout.NORTH, textPane, 6, SpringLayout.SOUTH, lblNewLabel);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, btnMv);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, -330, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, btnMv);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -209, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JTree tree = new JTree();
		springLayout.putConstraint(SpringLayout.NORTH, tree, 50, SpringLayout.SOUTH, textPane);
		springLayout.putConstraint(SpringLayout.WEST, tree, -278, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, tree, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tree, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(tree);
		
		JLabel lblFileView = new JLabel("           File View");
		springLayout.putConstraint(SpringLayout.NORTH, lblFileView, 6, SpringLayout.SOUTH, textPane);
		springLayout.putConstraint(SpringLayout.WEST, lblFileView, -180, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblFileView, -6, SpringLayout.NORTH, tree);
		springLayout.putConstraint(SpringLayout.EAST, lblFileView, -83, SpringLayout.EAST, getContentPane());
		lblFileView.setBackground(SystemColor.activeCaption);
		getContentPane().add(lblFileView);
		setSize(1180, 693);
		setResizable(false);
		setVisible(true);
	}
}
