package BL;
//import javax.swing.JFrame;
//import javax.swing.SpringLayout;
//import javax.swing.JButton;
//
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.io.IOException;
//
//import javax.swing.JTextField;
//import javax.swing.JTextPane;
//import javax.swing.JList;
//import javax.swing.JComboBox;
//import javax.swing.JRadioButton;
//
//
//public class GUI extends JFrame {
//	private JTextField textField;
//	private JTextField textField_1;
//	private JTextField textField_2;
//	private LinuxCommand commands;
//	
//	public GUI() throws IOException, InterruptedException {
//	    commands = new LinuxCommand();
//		SpringLayout springLayout = new SpringLayout();
//		getContentPane().setLayout(springLayout);
//		
//		JButton btnLs = new JButton("LS");
//		springLayout.putConstraint(SpringLayout.NORTH, btnLs, 10, SpringLayout.NORTH, getContentPane());
//		springLayout.putConstraint(SpringLayout.WEST, btnLs, 10, SpringLayout.WEST, getContentPane());
//		springLayout.putConstraint(SpringLayout.SOUTH, btnLs, -618, SpringLayout.SOUTH, getContentPane());
//		getContentPane().add(btnLs);
//		
//		JButton btnGrep = new JButton("Grep");
//		springLayout.putConstraint(SpringLayout.WEST, btnGrep, 10, SpringLayout.WEST, getContentPane());
//		springLayout.putConstraint(SpringLayout.EAST, btnGrep, -1089, SpringLayout.EAST, getContentPane());
//		springLayout.putConstraint(SpringLayout.EAST, btnLs, 0, SpringLayout.EAST, btnGrep);
//		springLayout.putConstraint(SpringLayout.NORTH, btnGrep, 52, SpringLayout.NORTH, getContentPane());
//		getContentPane().add(btnGrep);
//		
//		JButton btnNewButton = new JButton("Find");
//		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 93, SpringLayout.NORTH, getContentPane());
//		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, getContentPane());
//		springLayout.putConstraint(SpringLayout.SOUTH, btnGrep, -6, SpringLayout.NORTH, btnNewButton);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
//		getContentPane().add(btnNewButton);
//		
//		textField = new JTextField();
//		springLayout.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, btnGrep);
//		springLayout.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, btnGrep);
//		springLayout.putConstraint(SpringLayout.SOUTH, textField, -577, SpringLayout.SOUTH, getContentPane());
//		getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		textField_1 = new JTextField();
//		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -6, SpringLayout.WEST, textField_1);
//		springLayout.putConstraint(SpringLayout.WEST, textField_1, 91, SpringLayout.WEST, getContentPane());
//		springLayout.putConstraint(SpringLayout.EAST, textField_1, -997, SpringLayout.EAST, getContentPane());
//		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 93, SpringLayout.NORTH, getContentPane());
//		getContentPane().add(textField_1);
//		textField_1.setColumns(10);
//		
//		JTextPane textPane = new JTextPane();
//		springLayout.putConstraint(SpringLayout.NORTH, textPane, 10, SpringLayout.NORTH, getContentPane());
//		springLayout.putConstraint(SpringLayout.WEST, textPane, -244, SpringLayout.EAST, getContentPane());
//		springLayout.putConstraint(SpringLayout.SOUTH, textPane, 533, SpringLayout.NORTH, getContentPane());
//		springLayout.putConstraint(SpringLayout.EAST, textPane, -10, SpringLayout.EAST, getContentPane());
//		getContentPane().add(textPane);
//		
//		JButton btnAddUser = new JButton("Add user");
//		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -6, SpringLayout.NORTH, btnAddUser);
//		springLayout.putConstraint(SpringLayout.SOUTH, textField_1, -6, SpringLayout.NORTH, btnAddUser);
//		springLayout.putConstraint(SpringLayout.NORTH, btnAddUser, 134, SpringLayout.NORTH, getContentPane());
//		springLayout.putConstraint(SpringLayout.WEST, btnAddUser, 10, SpringLayout.WEST, getContentPane());
//		getContentPane().add(btnAddUser);
//		
//		textField_2 = new JTextField();
//		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, btnAddUser);
//		springLayout.putConstraint(SpringLayout.WEST, textField_2, 6, SpringLayout.EAST, btnAddUser);
//		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, 0, SpringLayout.SOUTH, btnAddUser);
//		getContentPane().add(textField_2);
//		textField_2.setColumns(10);
//		
//		JButton btnRemoveUser = new JButton("Remove User");
//		springLayout.putConstraint(SpringLayout.SOUTH, btnAddUser, -6, SpringLayout.NORTH, btnRemoveUser);
//		springLayout.putConstraint(SpringLayout.SOUTH, btnRemoveUser, -453, SpringLayout.SOUTH, getContentPane());
//		springLayout.putConstraint(SpringLayout.NORTH, btnRemoveUser, 175, SpringLayout.NORTH, getContentPane());
//		springLayout.putConstraint(SpringLayout.WEST, btnRemoveUser, 10, SpringLayout.WEST, getContentPane());
//		getContentPane().add(btnRemoveUser);
//		
//		JComboBox comboBox = new JComboBox();
//		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, textField_2);
//		springLayout.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, btnRemoveUser);
//		springLayout.putConstraint(SpringLayout.SOUTH, comboBox, 0, SpringLayout.SOUTH, btnRemoveUser);
//		getContentPane().add(comboBox);
//		
//		JRadioButton rdbtnDirectory = new JRadioButton("Directory");
//		springLayout.putConstraint(SpringLayout.NORTH, rdbtnDirectory, 0, SpringLayout.NORTH, btnGrep);
//		springLayout.putConstraint(SpringLayout.WEST, rdbtnDirectory, 6, SpringLayout.EAST, textField);
//		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnDirectory, 0, SpringLayout.SOUTH, btnGrep);
//		getContentPane().add(rdbtnDirectory);
//		
//		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
//		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 0, SpringLayout.NORTH, btnGrep);
//		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 6, SpringLayout.EAST, rdbtnDirectory);
//		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton, 0, SpringLayout.SOUTH, btnGrep);
//		getContentPane().add(rdbtnNewRadioButton);
//		
//		JRadioButton radioButton = new JRadioButton("Directory");
//		springLayout.putConstraint(SpringLayout.NORTH, radioButton, 0, SpringLayout.NORTH, btnNewButton);
//		springLayout.putConstraint(SpringLayout.WEST, radioButton, 6, SpringLayout.EAST, textField_1);
//		springLayout.putConstraint(SpringLayout.SOUTH, radioButton, -536, SpringLayout.SOUTH, getContentPane());
//		getContentPane().add(radioButton);
//		
//		JRadioButton rdbtnR = new JRadioButton("R");
//		springLayout.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, rdbtnR);
//		springLayout.putConstraint(SpringLayout.NORTH, rdbtnR, 0, SpringLayout.NORTH, btnAddUser);
//		springLayout.putConstraint(SpringLayout.WEST, rdbtnR, 6, SpringLayout.EAST, textField_2);
//		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnR, 0, SpringLayout.SOUTH, btnAddUser);
//		getContentPane().add(rdbtnR);
//		
//		JRadioButton rdbtnW = new JRadioButton("W");
//		springLayout.putConstraint(SpringLayout.NORTH, rdbtnW, 0, SpringLayout.NORTH, btnAddUser);
//		springLayout.putConstraint(SpringLayout.WEST, rdbtnW, 6, SpringLayout.EAST, rdbtnR);
//		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnW, 0, SpringLayout.SOUTH, btnAddUser);
//		getContentPane().add(rdbtnW);
//		
//		JRadioButton rdbtnX = new JRadioButton("X");
//		springLayout.putConstraint(SpringLayout.EAST, rdbtnW, -6, SpringLayout.WEST, rdbtnX);
//		springLayout.putConstraint(SpringLayout.WEST, rdbtnX, 270, SpringLayout.WEST, getContentPane());
//		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnX, 0, SpringLayout.SOUTH, btnAddUser);
//		springLayout.putConstraint(SpringLayout.NORTH, rdbtnX, 0, SpringLayout.NORTH, btnAddUser);
//		
//		
//		
//		getContentPane().add(rdbtnX);
//		setSize(1180, 693);
//		setResizable(false);
//		setVisible(true);
//	}
//
//}
